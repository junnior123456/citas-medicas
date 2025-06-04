-- Tabla de pacientes
CREATE TABLE IF NOT EXISTS paciente (
    id SERIAL PRIMARY KEY,
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    dni VARCHAR(15),
    correo VARCHAR(100)
);

-- Tabla de doctores
CREATE TABLE IF NOT EXISTS doctor (
    id SERIAL PRIMARY KEY,
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    especialidad VARCHAR(100),
    horario_disponible TEXT
);

-- Tabla de citas médicas
CREATE TABLE IF NOT EXISTS cita (
    id SERIAL PRIMARY KEY,
    paciente_id INTEGER NOT NULL,
    doctor_id INTEGER NOT NULL,
    fecha_hora TIMESTAMP NOT NULL,
    modalidad VARCHAR(50), -- presencial / virtual
    estado VARCHAR(50) DEFAULT 'Pendiente',
    CONSTRAINT fk_paciente FOREIGN KEY(paciente_id) REFERENCES paciente(id) ON DELETE CASCADE,
    CONSTRAINT fk_doctor FOREIGN KEY(doctor_id) REFERENCES doctor(id) ON DELETE CASCADE
);

-- Tabla de atención médica (resumen de la cita)
CREATE TABLE IF NOT EXISTS atencion (
    id SERIAL PRIMARY KEY,
    cita_id INTEGER UNIQUE NOT NULL,
    resumen TEXT,
    diagnostico TEXT,
    CONSTRAINT fk_cita FOREIGN KEY(cita_id) REFERENCES cita(id) ON DELETE CASCADE
);

-- Tabla de medicamentos recetados
CREATE TABLE IF NOT EXISTS medicacion (
    id SERIAL PRIMARY KEY,
    atencion_id INTEGER NOT NULL,
    medicamento VARCHAR(100),
    dosis VARCHAR(100),
    frecuencia VARCHAR(100),
    duracion VARCHAR(100),
    CONSTRAINT fk_atencion FOREIGN KEY(atencion_id) REFERENCES atencion(id) ON DELETE CASCADE
);
