package com.uisrael.crud.proyecto.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "estudiante")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",length = 50)
    private String nombre;

    @Column(name = "apellido",length = 50)
    private String apellido;

    @Column(name = "email",length = 50, unique = true)
    private String email;

}
