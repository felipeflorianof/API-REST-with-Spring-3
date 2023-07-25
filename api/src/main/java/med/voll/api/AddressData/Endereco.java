package med.voll.api.AddressData;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(AddressData endereco) {

        this.logradouro = endereco.logradouro();
        this.numero = endereco.numero();
        this.bairro = endereco.bairro();
        this.cidade = endereco.cidade();
        this.estado = endereco.estado();
        this.cep = endereco.cep();
    }
    public void updateData(AddressData data) {

        if(data.logradouro() != null) {
            this.logradouro = data.logradouro();
        }
        if(data.numero() != null) {
            this.numero = data.numero();
        }
        if(data.bairro() != null) {
            this.bairro = data.bairro();
        }
        if(data.cidade() != null) {
            this.cidade = data.cidade();
        }
        if(data.cep() != null) {
            this.cep = data.cep();
        }
    }
}
