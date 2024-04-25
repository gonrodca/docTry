import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ServicioUsuario
 */

 @Service
public class ServicioUsuario {

    @Autowired
    private RepositorioUsuario userRepository;

    public List<Usuario> getAll(){
        return userRepository.findAll();
    }

    public Usuario getUsuarioById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public Usuario save(Usuario user){
        
        return userRepository.save(user);
    }
}