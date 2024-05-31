package invop.services;

import invop.entities.ProveedorArticulo;
import invop.repositories.ProveedorArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProveedorArticuloServiceImpl extends BaseServiceImpl<ProveedorArticulo, Long> implements ProveedorArticuloService {

    @Autowired
    public ProveedorArticuloServiceImpl(ProveedorArticuloRepository proveedorArticuloRepository){
        super(proveedorArticuloRepository);
    }
}
