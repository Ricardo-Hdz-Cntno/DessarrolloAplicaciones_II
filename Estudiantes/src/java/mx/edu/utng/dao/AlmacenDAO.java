/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.dao;

import java.util.List;
import mx.edu.utng.model.Almacen;

/**
 *
 * @author Ricardo
 */
public interface AlmacenDAO {
    void agregarAlmacen(Almacen almacen);
    void borrarAlmacen(int idalmacen);
    void cambiarAlmacen(Almacen almacen);
    List<Almacen> desplegarAlmacenes();
    Almacen elegirAlmacen(int idalmacen);
}
