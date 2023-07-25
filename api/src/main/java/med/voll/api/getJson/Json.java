package med.voll.api.getJson;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.AddressData.AddressData;
import med.voll.api.AddressData.Endereco;

@Table(name = "testing")
@Entity(name = "Testing")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Json{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String idade;
    private String email;
    private String telefone;
    private boolean ativo;

    @Embedded
    private Endereco endereco;

    public Json(getJson json) {
        this.ativo = true;
        this.nome = json.nome();
        this.idade = json.idade();
        this.email = json.email();
        this.telefone = json.telefone();
        this.endereco = new Endereco(json.endereco());
    }

    public void updateData(updateJson data) {

        if(data.nome() != null) {
            this.nome = data.nome();
        }
        if(data.idade() != null) {
            this.idade = data.idade();
        }
        if(data.email() != null) {
            this.email = data.email();
        }
        if(data.telefone() != null) {
            this.nome = data.telefone();
        }
        if(data.endereco() != null) {
            this.endereco.updateData(data.endereco());
        }

    }

    public void remove() {
        this.ativo = false;
    }
}

