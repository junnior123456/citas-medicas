package upeu.edu.pe.auth_server.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_info")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    private String rol; // PACIENTE o DOCTOR

    @Column(name = "referencia_id")
    private Long referenciaId; // ID de doctor o paciente

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public Long getReferenciaId() { return referenciaId; }
    public void setReferenciaId(Long referenciaId) { this.referenciaId = referenciaId; }

    // Builder para instancias
    public static class Builder {
        private Long id;
        private String username;
        private String password;
        private String rol;
        private Long referenciaId;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder rol(String rol) {
            this.rol = rol;
            return this;
        }

        public Builder referenciaId(Long referenciaId) {
            this.referenciaId = referenciaId;
            return this;
        }

        public UserEntity build() {
            UserEntity user = new UserEntity();
            user.setId(id);
            user.setUsername(username);
            user.setPassword(password);
            user.setRol(rol);
            user.setReferenciaId(referenciaId);
            return user;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
