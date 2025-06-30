package upeu.edu.pe.auth_server.dtos;

public class UserDto {
    private String username;
    private String password;
    private String rol;
    private Long referenciaId;

    public UserDto() {}

    public UserDto(String username, String password, String rol, Long referenciaId) {
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.referenciaId = referenciaId;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public Long getReferenciaId() { return referenciaId; }
    public void setReferenciaId(Long referenciaId) { this.referenciaId = referenciaId; }

    public static class Builder {
        private String username;
        private String password;
        private String rol;
        private Long referenciaId;

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

        public UserDto build() {
            return new UserDto(username, password, rol, referenciaId);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
