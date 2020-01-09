package com.gestion_biens.pfs_back.Models.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gestion_biens.pfs_back.Models.Bien.Agence;
import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Set;
import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@Entity
public class Agent extends Utilisateur {

    @Override
    public void setRole(String role) {
        super.setRole("ROLE_USER");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "agent",fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private Set<Annonce> annonces;

 @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;

    public Set<Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Set<Annonce> annonce) {
        this.annonces = annonces;
    }


    public Agent() {super();
    }
  public Agent(Annonce... annonces){

        this.annonces= Stream.of(annonces).collect(Collectors.toSet());
        this.annonces.forEach(x -> x.setAgent(this));
    }
    public Agent(String nom, String prenom){
        super(nom,prenom);
    }

}
