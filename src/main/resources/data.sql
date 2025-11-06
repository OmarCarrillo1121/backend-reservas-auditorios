INSERT INTO ponente_tipo (nombre_tipo_ponente, creado_por, creado_el, actualizado_por, actualizado_el)
VALUES
('Ponente', 1, '2025-11-05', 1, '2025-11-05'),
('Presidium', 1, '2025-11-05', 1, '2025-11-05');

INSERT INTO recinto (nombre, ubicacion, edificio, capacidad, creado_por, creado_el, actualizado_por, actualizado_el)
VALUES
('Aula Magna de Profesores Eméritos', 'Ciudad Universitaria, Facultad de Contaduría y Administración', 'Entrada principal', 50, 1, '2025-11-06', 1, '2025-11-06'),
('C.P. Alfonso Ochoa Ravizé', 'Ciudad Universitaria', 'Edificio F Planta baja', 95, 1, '2025-11-06', 1, '2025-11-06'),
('Frontón cerrado', 'Ciudad Universitaria', 'Edificio J', 0, 1, '2025-11-06', 1, '2025-11-06'),
('Maestro Carlos Pérez del Toro', 'Ciudad Universitaria', 'Entrada principal', 580, 1, '2025-11-06', 1, '2025-11-06'),
('Maestro Jose Antonio Echenique García', 'Ciudad Universitaria', 'Entrada principal Planta baja', 150, 1, '2025-11-06', 1, '2025-11-06'),
('Aula del Método del Caso I', 'Ciudad Universitaria', 'Edificio I Planta Baja', 80, 1, '2025-11-06', 1, '2025-11-06'),
('Aula del Método del Caso II', 'Ciudad Universitaria', 'Edificio I Planta Baja', 80, 1, '2025-11-06', 1, '2025-11-06'),
('Aula del Método del Caso III', 'Ciudad Universitaria', 'Edificio J Piso 2', 80, 1, '2025-11-06', 1, '2025-11-06'),
('Aula del Método del Caso IV', 'Ciudad Universitaria', 'Edificio J Piso 2', 80, 1, '2025-11-06', 1, '2025-11-06'),
('Aula Magna de Investigación', 'Ciudad Universitaria', 'Edificio de Investigación', 50, 1, '2025-11-06', 1, '2025-11-06'),
('C.P. Arturo Elizundia Charles', 'Ciudad Universitaria', 'Edificio de Posgrado', 110, 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO recinto_equipamiento_catalogo (nombre_equipamiento, descripcion_equipamiento, creado_por, creado_el, actualizado_por, actualizado_el)
VALUES
('Proyector', 'Proyector HD con entrada HDMI y VGA', 1, '2025-11-05', 1, '2025-11-05'),
('Pantalla', 'Pantalla retráctil de 120 pulgadas', 1, '2025-11-05', 1, '2025-11-05'),
('Micrófono inalámbrico', 'Micrófono de mano con receptor inalámbrico', 1, '2025-11-05', 1, '2025-11-05'),
('Bocinas', 'Sistema de sonido estéreo con amplificador', 1, '2025-11-05', 1, '2025-11-05'),
('Computadora', 'Equipo de cómputo con conexión a internet', 1, '2025-11-05', 1, '2025-11-05'),
('Podio', 'Podio de madera con compartimentos', 1, '2025-11-05', 1, '2025-11-05'),
('Cámara', 'Cámara de video para transmisión en vivo', 1, '2025-11-05', 1, '2025-11-05'),
('Sillas', 'Sillas ergonómicas para los asistentes', 1, '2025-11-05', 1, '2025-11-05'),
('Mesa de conferencias', 'Mesa grande para ponentes o presidium', 1, '2025-11-05', 1, '2025-11-05'),
('Aire acondicionado', 'Sistema de climatización automático', 1, '2025-11-05', 1, '2025-11-05');

INSERT INTO recursos_area (nombre_area, ubicacion_area, responsable_area, correo_contacto, numero_contacto, creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
('Actos', 'Edificio Principal - Planta Baja', 'María López', 'maria.lopez@fca.unam.mx', '5512345678', 1, '2025-11-05', 1, '2025-11-05'),
('Centro de Informática', 'Edificio B - Segundo Piso', 'Jorge Martínez', 'jorge.martinez@fca.unam.mx', '5523456789', 1, '2025-11-05', 1, '2025-11-05'),
('Medios Audiovisuales', 'Edificio C - Planta Alta', 'Laura Hernández', 'laura.hernandez@fca.unam.mx', '5534567890', 1, '2025-11-05', 1, '2025-11-05'),
('Publicaciones y Fomento Editorial', 'Edificio D - Planta Baja', 'Carlos Ramírez', 'carlos.ramirez@fca.unam.mx', '5545678901', 1, '2025-11-05', 1, '2025-11-05'),
('Secretaría Administrativa', 'Edificio Principal - Oficina 102', 'Ana Torres', 'ana.torres@fca.unam.mx', '5556789012', 1, '2025-11-05', 1, '2025-11-05'),
('Difusión Cultural', 'Edificio E - Planta Alta', 'Ricardo Gómez', 'ricardo.gomez@fca.unam.mx', '5567890123', 1, '2025-11-05', 1, '2025-11-05'),
('Servicios Escolares', 'Edificio F - Planta Baja', 'Patricia Ruiz', 'patricia.ruiz@fca.unam.mx', '5578901234', 1, '2025-11-05', 1, '2025-11-05'),
('Recursos Humanos', 'Edificio G - Oficina 205', 'Héctor Sánchez', 'hector.sanchez@fca.unam.mx', '5589012345', 1, '2025-11-05', 1, '2025-11-05'),
('Mantenimiento', 'Edificio H - Taller Central', 'Luis Ortega', 'luis.ortega@fca.unam.mx', '5590123456', 1, '2025-11-05', 1, '2025-11-05'),
('Seguridad y Protección Civil', 'Edificio I - Planta Baja', 'Gabriela Flores', 'gabriela.flores@fca.unam.mx', '5501234567', 1, '2025-11-05', 1, '2025-11-05');

INSERT INTO recursos_catalogo (nombre_recurso, descripcion_recurso, creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
('Paño azul', 'Tela utilizada para cubrir mesas o superficies durante eventos', 1, '2025-11-05', NULL, NULL),
('Mesa adicional', 'Mesa extra disponible para material o ponentes', 1, '2025-11-05', NULL, NULL),
('Personalizadores', 'Etiquetas o gafetes personalizados para los asistentes', 1, '2025-11-05', NULL, NULL),
('Laptop', 'Equipo portátil para presentaciones o apoyo técnico', 1, '2025-11-05', NULL, NULL),
('Zoom', 'Acceso o soporte para videollamadas y transmisiones en línea', 1, '2025-11-05', NULL, NULL),
('Equipo de sonido', 'Micrófonos, bocinas y mezcladora para eventos', 1, '2025-11-05', NULL, NULL),
('Pantalla', 'Pantalla para proyección de presentaciones o videos', 1, '2025-11-05', NULL, NULL),
('Videoproyector', 'Proyector para presentaciones multimedia', 1, '2025-11-05', NULL, NULL),
('Fotógrafo', 'Servicio de fotografía para registro del evento', 1, '2025-11-05', NULL, NULL),
('Boletín / Reportero', 'Cobertura periodística o redacción de boletín del evento', 1, '2025-11-05', NULL, NULL),
('Vigilancia', 'Personal de seguridad asignado al evento', 1, '2025-11-05', NULL, NULL),
('Presidium', 'Mesa y sillas asignadas a los ponentes o autoridades', 1, '2025-11-05', NULL, NULL),
('Otros', 'Recursos adicionales no especificados', 1, '2025-11-05', NULL, NULL),
('Limpieza entrada', 'Personal de limpieza para la zona de acceso principal', 1, '2025-11-05', NULL, NULL),
('Limpieza de auditorio', 'Servicio de limpieza general dentro del auditorio', 1, '2025-11-05', NULL, NULL),
('Limpieza de baños', 'Mantenimiento y limpieza de sanitarios durante el evento', 1, '2025-11-05', NULL, NULL),
('Limpieza vestidores', 'Limpieza de camerinos y zonas de preparación', 1, '2025-11-05', NULL, NULL),
('Abrir auditorio', 'Servicio para apertura y preparación del recinto', 1, '2025-11-05', NULL, NULL);

INSERT INTO reservacion_horas_disponibles (hora, creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
('08:00:00', 1, '2025-11-06', 1, '2025-11-06'),
('09:00:00', 1, '2025-11-06', 1, '2025-11-06'),
('10:00:00', 1, '2025-11-06', 1, '2025-11-06'),
('11:00:00', 1, '2025-11-06', 1, '2025-11-06'),
('12:00:00', 1, '2025-11-06', 1, '2025-11-06'),
('13:00:00', 1, '2025-11-06', 1, '2025-11-06'),
('14:00:00', 1, '2025-11-06', 1, '2025-11-06'),
('15:00:00', 1, '2025-11-06', 1, '2025-11-06'),
('16:00:00', 1, '2025-11-06', 1, '2025-11-06'),
('17:00:00', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO reservacion_origen (nombre_origen, creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
('Programa', 1, '2025-11-06', 1, '2025-11-06'),
('Congreso', 1, '2025-11-06', 1, '2025-11-06'),
('Evento Académico', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO reservacion_status (nombre_status, color_status, creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
('Pendiente', '#FFC107', 1, '2025-11-06', 1, '2025-11-06'),
('Aprobado', '#4CAF50', 1, '2025-11-06', 1, '2025-11-06'),
('Cancelado', '#F44336', 1, '2025-11-06', 1, '2025-11-06'),
('Reprogramado', '#2196F3', 1, '2025-11-06', 1, '2025-11-06'),
('Finalizado', '#607D8B', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO reservacion_tipo_evento (nombre_tipo_evento, descripcion_tipo_evento, creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
('Taller', 'Sesión práctica con participación activa de los asistentes', 1, '2025-11-06', 1, '2025-11-06'),
('Conferencia', 'Presentación formal de un tema ante un público amplio', 1, '2025-11-06', 1, '2025-11-06'),
('Conversatorio', 'Diálogo interactivo entre expertos y asistentes', 1, '2025-11-06', 1, '2025-11-06'),
('Charla', 'Exposición breve e informal sobre un tema específico', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO semestre (nombre_semestre, anio_semestre, inicio_actividades, fin_actividades, creado_por, creado_el, actualizado_por, actualizado_el) VALUES
('2026-1', '2025', '2025-08-11', '2025-12-11', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO semestre_tipo_evento (nombre_tipo_evento, color_evento, creado_por, creado_el, actualizado_por, actualizado_el)
VALUES
('Dia inhabil', '#FF0000', 1, '2025-11-06', 1, '2025-11-06'),
('Vacaciones administrativas', '#FFA500', 1, '2025-11-06', 1, '2025-11-06'),
('Taller', '#0000FF', 1, '2025-11-06', 1, '2025-11-06'),
('Conferencia', '#008000', 1, '2025-11-06', 1, '2025-11-06'),
('Conversatorio', '#800080', 1, '2025-11-06', 1, '2025-11-06'),
('Charla', '#FFC0CB', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO usuario_area (nombre_area, creado_por, creado_el, actualizado_por, actualizado_el)
VALUES
('Coordinacion de programas educativos', 1, '2025-11-06', 1, '2025-11-06'),
('Secretaría Administrativa', 1, '2025-11-06', 1, '2025-11-06'),
('Bolsa de Trabajo', 1, '2025-11-06', 1, '2025-11-06'),
('Orientación y tutorías', 1, '2025-11-06', 1, '2025-11-06'),
('Centro de Informática', 1, '2025-11-06', 1, '2025-11-06'),
('Recursos Humanos', 1, '2025-11-06', 1, '2025-11-06'),
('Finanzas', 1, '2025-11-06', 1, '2025-11-06'),
('Biblioteca', 1, '2025-11-06', 1, '2025-11-06'),
('Fomento editorial', 1, '2025-11-06', 1, '2025-11-06'),
('Investigación', 1, '2025-11-06', 1, '2025-11-06'),
('Posgrado', 1, '2025-11-06', 1, '2025-11-06'),
('Comunicación social', 1, '2025-11-06', 1, '2025-11-06'),
('Laboratorios', 1, '2025-11-06', 1, '2025-11-06'),
('Docencia', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO usuario_facultad (nombre_facultad, creado_por, creado_el, actualizado_por, actualizado_el) VALUES
('Contaduria', 1, '2025-11-06', 1, '2025-11-06'),
('Administración', 1, '2025-11-06', 1, '2025-11-06'),
('Informática', 1, '2025-11-06', 1, '2025-11-06'),
('Negocios Internacionales', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO usuario_puesto (nombre_puesto, creado_por, creado_el, actualizado_por, actualizado_el) VALUES
('Profesor/Asesor', 1, '2025-11-06', 1, '2025-11-06'),
('Investigador', 1, '2025-11-06', 1, '2025-11-06'),
('Coordinador de Carrera', 1, '2025-11-06', 1, '2025-11-06'),
('Director de Departamento', 1, '2025-11-06', 1, '2025-11-06'),
('Secretario Administrativo', 1, '2025-11-06', 1, '2025-11-06'),
('Coordinador Administrativo', 1, '2025-11-06', 1, '2025-11-06'),
('Subdirector', 1, '2025-11-06', 1, '2025-11-06'),
('Jefe de Área', 1, '2025-11-06', 1, '2025-11-06'),
('Auxiliar Administrativo', 1, '2025-11-06', 1, '2025-11-06'),
('Responsable de Recursos Humanos', 1, '2025-11-06', 1, '2025-11-06'),
('Responsable de Finanzas', 1, '2025-11-06', 1, '2025-11-06'),
('Responsable de Contabilidad', 1, '2025-11-06', 1, '2025-11-06'),
('Encargado de Comunicación Social', 1, '2025-11-06', 1, '2025-11-06'),
('Director de Facultad', 1, '2025-11-06', 1, '2025-11-06'),
('Secretario de Facultad', 1, '2025-11-06', 1, '2025-11-06'),
('Coordinador de Posgrado', 1, '2025-11-06', 1, '2025-11-06'),
('Coordinador de Bolsa de Trabajo', 1, '2025-11-06', 1, '2025-11-06'),
('Encargado de Fomento Editorial', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO usuario_rol (nombre_rol, activo, creado_por, creado_el, actualizado_por, actualizado_el)
VALUES
('Administrador', 1, 1, '2025-11-06', 1, '2025-11-06'),
('Usuario', 1, 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO ponente (nombre_ponente, grado_ponente, tipo_ponente, creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
('Dr. Juan Pérez', 'Doctorado en Ciencias', 1, 1, '2025-11-01', 1, '2025-11-01'),
('Mtra. Laura Gómez', 'Maestría en Educación', 2, 1, '2025-11-01', 1, '2025-11-01'),
('Ing. Carlos Ramírez', 'Ingeniería Industrial', 1, 1, '2025-11-01', 1, '2025-11-01'),
('Lic. Ana Torres', 'Licenciatura en Derecho', 2, 1, '2025-11-01', 1, '2025-11-01'),
('Dr. Roberto Díaz', 'Doctorado en Física', 1, 1, '2025-11-01', 1, '2025-11-01'),
('Mtra. Sofía Herrera', 'Maestría en Comunicación', 2, 1, '2025-11-01', 1, '2025-11-01'),
('Ing. Eduardo López', 'Ingeniería en Sistemas', 1, 1, '2025-11-01', 1, '2025-11-01'),
('Lic. Gabriela Soto', 'Licenciatura en Psicología', 2, 1, '2025-11-01', 1, '2025-11-01'),
('Dr. Fernando Cruz', 'Doctorado en Economía', 1, 1, '2025-11-01', 1, '2025-11-01'),
('Ing. Mariana Vega', 'Ingeniería Civil', 1, 1, '2025-11-01', 1, '2025-11-01');

INSERT INTO ponente_semblanza (id_ponente, nombre_archivo, ruta_archivo, creado_por, creado_el, actualizado_por, actualizado_el)
VALUES
(1, 'semblanza_juanperez.pdf', '/uploads/ponentes/semblanzas/semblanza_juanperez.pdf', 1, '2025-11-05', 1, '2025-11-05'),
(2, 'semblanza_mariagonzalez.pdf', '/uploads/ponentes/semblanzas/semblanza_mariagonzalez.pdf', 1, '2025-11-05', 1, '2025-11-05'),
(3, 'semblanza_carloslopez.pdf', '/uploads/ponentes/semblanzas/semblanza_carloslopez.pdf', 1, '2025-11-05', 1, '2025-11-05'),
(4, 'semblanza_anafernandez.pdf', '/uploads/ponentes/semblanzas/semblanza_anafernandez.pdf', 1, '2025-11-05', 1, '2025-11-05'),
(5, 'semblanza_joseramirez.pdf', '/uploads/ponentes/semblanzas/semblanza_joseramirez.pdf', 1, '2025-11-05', 1, '2025-11-05'),
(6, 'semblanza_luisamartinez.pdf', '/uploads/ponentes/semblanzas/semblanza_luisamartinez.pdf', 1, '2025-11-05', 1, '2025-11-05'),
(7, 'semblanza_pedrohernandez.pdf', '/uploads/ponentes/semblanzas/semblanza_pedrohernandez.pdf', 1, '2025-11-05', 1, '2025-11-05'),
(8, 'semblanza_claudiasanchez.pdf', '/uploads/ponentes/semblanzas/semblanza_claudiasanchez.pdf', 1, '2025-11-05', 1, '2025-11-05'),
(9, 'semblanza_miguelsolis.pdf', '/uploads/ponentes/semblanzas/semblanza_miguelsolis.pdf', 1, '2025-11-05', 1, '2025-11-05'),
(10, 'semblanza_andrearivera.pdf', '/uploads/ponentes/semblanzas/semblanza_andrearivera.pdf', 1, '2025-11-05', 1, '2025-11-05');

INSERT INTO recinto_equipamiento (id_recinto, id_equipamiento, creado_por, creado_el, actualizado_por, actualizado_el)
VALUES
(1, 1, 1, '2025-11-05', 1, '2025-11-05'),
(1, 2, 1, '2025-11-05', 1, '2025-11-05'),
(2, 3, 1, '2025-11-05', 1, '2025-11-05'),
(2, 4, 1, '2025-11-05', 1, '2025-11-05'),
(3, 5, 1, '2025-11-05', 1, '2025-11-05'),
(3, 6, 1, '2025-11-05', 1, '2025-11-05'),
(4, 7, 1, '2025-11-05', 1, '2025-11-05'),
(5, 8, 1, '2025-11-05', 1, '2025-11-05'),
(6, 9, 1, '2025-11-05', 1, '2025-11-05'),
(7, 10, 1, '2025-11-05', 1, '2025-11-05');

INSERT INTO recinto_imagen (id_recinto, ruta_imagen, nombre_archivo, tamanio_archivo, creado_por, creado_el, actualizado_por, actualizado_el)
VALUES
(1, '/imagenes/recintos/auditorio_central_1.jpg', 'auditorio_central_1.jpg', 204800, 1, '2025-11-05', 1, '2025-11-05'),
(1, '/imagenes/recintos/auditorio_central_2.jpg', 'auditorio_central_2.jpg', 198500, 1, '2025-11-05', 1, '2025-11-05'),
(2, '/imagenes/recintos/salon_conferencias_1.jpg', 'salon_conferencias_1.jpg', 176300, 1, '2025-11-05', 1, '2025-11-05'),
(2, '/imagenes/recintos/salon_conferencias_2.jpg', 'salon_conferencias_2.jpg', 189400, 1, '2025-11-05', 1, '2025-11-05'),
(3, '/imagenes/recintos/aula_magna_1.jpg', 'aula_magna_1.jpg', 210600, 1, '2025-11-05', 1, '2025-11-05'),
(4, '/imagenes/recintos/sala_proyeccion_1.jpg', 'sala_proyeccion_1.jpg', 195700, 1, '2025-11-05', 1, '2025-11-05'),
(5, '/imagenes/recintos/auditorio_fca_1.jpg', 'auditorio_fca_1.jpg', 230000, 1, '2025-11-05', 1, '2025-11-05'),
(6, '/imagenes/recintos/auditorio_lateral_1.jpg', 'auditorio_lateral_1.jpg', 205400, 1, '2025-11-05', 1, '2025-11-05'),
(7, '/imagenes/recintos/sala_virtual_1.jpg', 'sala_virtual_1.jpg', 178900, 1, '2025-11-05', 1, '2025-11-05'),
(8, '/imagenes/recintos/sala_reuniones_1.jpg', 'sala_reuniones_1.jpg', 184200, 1, '2025-11-05', 1, '2025-11-05');

INSERT INTO semestre_eventos (id_semestre, id_tipo_evento, dia_evento, creado_por, creado_el, actualizado_por, actualizado_el) VALUES
(1, 1, '2026-01-20', 1, '2025-11-06', 1, '2025-11-06'),
(1, 2, '2026-01-22', 1, '2025-11-06', 1, '2025-11-06'),
(1, 3, '2026-01-25', 1, '2025-11-06', 1, '2025-11-06'),
(1, 4, '2026-01-28', 1, '2025-11-06', 1, '2025-11-06'),
(1, 1, '2026-02-02', 1, '2025-11-06', 1, '2025-11-06'),
(1, 2, '2026-02-05', 1, '2025-11-06', 1, '2025-11-06'),
(1, 3, '2026-02-08', 1, '2025-11-06', 1, '2025-11-06'),
(1, 4, '2026-02-12', 1, '2025-11-06', 1, '2025-11-06'),
(1, 1, '2026-02-15', 1, '2025-11-06', 1, '2025-11-06'),
(1, 2, '2026-02-18', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO usuario (id_rol_usuario, nombre, apellido_paterno, apellido_materno, correo, contrasena, 
telefono_fijo, telefono_contacto, imagen_usuario, facultad_usuario, area_usuario, puesto_usuario, 
creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
(1, 'Carlos', 'Ramírez', 'Gómez', 'carlos.ramirez@unam.mx', '123456', '5551234567', '5587654321', NULL, 'FCA', 'Sistemas', 'Administrador', 1, '2025-11-05', 1, '2025-11-05'),
(2, 'María', 'López', 'Hernández', 'maria.lopez@unam.mx', '123456', NULL, '5598765432', NULL, 'FCA', 'Contaduría', 'Profesor', 1, '2025-11-05', 1, '2025-11-05'),
(2, 'José', 'Martínez', 'Pérez', 'jose.martinez@unam.mx', '123456', '5551112233', NULL, NULL, 'FCA', 'Informática', 'Estudiante', 1, '2025-11-05', 1, '2025-11-05'),
(3, 'Laura', 'García', 'Vega', 'laura.garcia@unam.mx', '123456', NULL, NULL, NULL, 'FCA', 'Recursos Humanos', 'Administrativo', 1, '2025-11-05', 1, '2025-11-05'),
(1, 'Pedro', 'Sánchez', 'Flores', 'pedro.sanchez@unam.mx', '123456', '5553334444', '5544445555', NULL, 'FCA', 'Sistemas', 'Coordinador', 1, '2025-11-05', 1, '2025-11-05'),
(2, 'Ana', 'Torres', 'Juárez', 'ana.torres@unam.mx', '123456', NULL, NULL, NULL, 'FCA', 'Administración', 'Profesor', 1, '2025-11-05', 1, '2025-11-05'),
(2, 'Miguel', 'Ortega', 'Salas', 'miguel.ortega@unam.mx', '123456', '5559998888', NULL, NULL, 'FCA', 'Mercadotecnia', 'Estudiante', 1, '2025-11-05', 1, '2025-11-05'),
(3, 'Diana', 'Reyes', 'Núñez', 'diana.reyes@unam.mx', '123456', NULL, '5588889999', NULL, 'FCA', 'Finanzas', 'Secretaria', 1, '2025-11-05', 1, '2025-11-05'),
(1, 'Jorge', 'Morales', 'Castillo', 'jorge.morales@unam.mx', '123456', '5557776666', NULL, NULL, 'FCA', 'Sistemas', 'Administrador', 1, '2025-11-05', 1, '2025-11-05'),
(2, 'Elena', 'Gómez', 'Ruiz', 'elena.gomez@unam.mx', '123456', NULL, '5577778888', NULL, 'FCA', 'Contaduría', 'Profesor', 1, '2025-11-05', 1, '2025-11-05');

INSERT INTO reservacion (id_recinto, id_solicitante, fecha_reservacion, hora_inicio, hora_termino, creado_por, creado_el, actualizado_por, actualizado_el) VALUES
(1, 1, '2025-11-10', '09:00:00', '11:00:00', 1, '2025-11-06', 1, '2025-11-06'),
(2, 2, '2025-11-11', '10:00:00', '12:00:00', 1, '2025-11-06', 1, '2025-11-06'),
(3, 3, '2025-11-12', '11:00:00', '13:00:00', 1, '2025-11-06', 1, '2025-11-06'),
(4, 4, '2025-11-13', '12:00:00', '14:00:00', 1, '2025-11-06', 1, '2025-11-06'),
(5, 5, '2025-11-14', '13:00:00', '15:00:00', 1, '2025-11-06', 1, '2025-11-06'),
(1, 2, '2025-11-15', '14:00:00', '16:00:00', 1, '2025-11-06', 1, '2025-11-06'),
(2, 3, '2025-11-16', '15:00:00', '17:00:00', 1, '2025-11-06', 1, '2025-11-06'),
(3, 4, '2025-11-17', '16:00:00', '18:00:00', 1, '2025-11-06', 1, '2025-11-06'),
(4, 5, '2025-11-18', '17:00:00', '19:00:00', 1, '2025-11-06', 1, '2025-11-06'),
(5, 1, '2025-11-19', '18:00:00', '20:00:00', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO recursos_reservacion 
(id_recurso, id_reservacion, cantidad_asignada, creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
(1, 1, 2, 1, '2025-11-05', 1, '2025-11-05'),
(2, 2, 1, 1, '2025-11-05', 2, '2025-11-05'),
(3, 3, 4, 3, '2025-11-05', 3, '2025-11-05'),
(4, 4, 1, 1, '2025-11-05', 1, '2025-11-05'),
(5, 5, 3, 2, '2025-11-05', 2, '2025-11-05'),
(6, 6, 2, 4, '2025-11-05', 4, '2025-11-05'),
(7, 7, 1, 1, '2025-11-05', 1, '2025-11-05'),
(8, 8, 2, 2, '2025-11-05', 2, '2025-11-05'),
(9, 9, 5, 3, '2025-11-05', 3, '2025-11-05'),
(10, 10, 1, 1, '2025-11-05', 1, '2025-11-05');

-- INSERT INTO reservacion_status (id_reservacion, id_status, comentario_reservacion, creado_por, creado_el, actualizado_por, actualizado_el) 
-- VALUES
-- (1, 1, 'Reservación confirmada', 1, '2025-11-06', 1, '2025-11-06'),
-- (2, 2, 'Pendiente de aprobación', 1, '2025-11-06', 1, '2025-11-06'),
-- (3, 1, 'Confirmada con cambios en horario', 1, '2025-11-06', 1, '2025-11-06'),
-- (4, 3, 'Cancelada por el solicitante', 1, '2025-11-06', 1, '2025-11-06'),
-- (5, 2, 'Pendiente de recursos adicionales', 1, '2025-11-06', 1, '2025-11-06'),
-- (1, 3, 'Cancelada por falta de disponibilidad', 1, '2025-11-06', 1, '2025-11-06'),
-- (2, 1, 'Reservación aprobada', 1, '2025-11-06', 1, '2025-11-06'),
-- (3, 2, 'Pendiente de confirmación del ponente', 1, '2025-11-06', 1, '2025-11-06'),
-- (4, 1, 'Confirmada con todos los recursos asignados', 1, '2025-11-06', 1, '2025-11-06'),
-- (5, 3, 'Cancelada por conflicto de agenda', 1, '2025-11-06', 1, '2025-11-06');

INSERT INTO login_historial (id_usuario, creado_por, creado_el, actualizado_por, actualizado_el) 
VALUES
(1, 1, '2025-11-05 08:10:00', 1, '2025-11-05 08:10:00'),
(2, 2, '2025-11-05 09:05:00', 2, '2025-11-05 09:05:00'),
(3, 3, '2025-11-05 09:45:00', 3, '2025-11-05 09:45:00'),
(4, 1, '2025-11-05 10:15:00', 1, '2025-11-05 10:15:00'),
(5, 1, '2025-11-05 10:30:00', 1, '2025-11-05 10:30:00'),
(6, 2, '2025-11-05 11:00:00', 2, '2025-11-05 11:00:00'),
(7, 3, '2025-11-05 11:30:00', 3, '2025-11-05 11:30:00'),
(8, 1, '2025-11-05 12:00:00', 1, '2025-11-05 12:00:00'),
(9, 2, '2025-11-05 12:15:00', 2, '2025-11-05 12:15:00'),
(10, 3, '2025-11-05 12:45:00', 3, '2025-11-05 12:45:00');