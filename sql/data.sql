-- Pacientes
INSERT INTO paciente (nombres, apellidos, dni, correo) VALUES 
('Juan', 'Pérez', '12345678', 'juanperez@example.com'),
('María', 'Gómez', '87654321', 'mariagomez@example.com');

-- Doctores
INSERT INTO doctor (nombres, apellidos, especialidad, horario_disponible) VALUES 
('Ana', 'Salazar', 'Cardiología', 'Lunes a Viernes 08:00-12:00'),
('Luis', 'Ramos', 'Medicina General', 'Martes y Jueves 14:00-18:00');

-- Citas
INSERT INTO cita (paciente_id, doctor_id, fecha_hora, modalidad, estado) VALUES 
(1, 1, '2025-06-10 09:00:00', 'presencial', 'Confirmada'),
(2, 2, '2025-06-11 15:30:00', 'virtual', 'Pendiente');

-- Atenciones
INSERT INTO atencion (cita_id, resumen, diagnostico) VALUES 
(1, 'Control de presión arterial', 'Hipertensión leve');

-- Medicaciones
INSERT INTO medicacion (atencion_id, medicamento, dosis, frecuencia, duracion) VALUES 
(1, 'Enalapril', '5 mg', '2 veces al día', '30 días');
