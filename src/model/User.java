package model;

public class User {


    private long id;
    private String nome;
    private String cognome;
    private Integer anni;
    private String email;

    public User(String nome, String cognome, Integer anni, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.anni = anni;
        this.email = email;
    }
    public User(long id, String nome, String cognome, Integer anni, String email) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.anni = anni;
        this.email = email;
    }



    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setAnni(Integer anni) {
        this.anni = anni;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Integer getAnni() {
        return anni;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", anni=" + anni +
                ", email='" + email + '\'' +
                '}';
    }

}
