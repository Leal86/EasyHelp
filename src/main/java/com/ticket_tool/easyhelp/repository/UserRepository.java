package com.ticket_tool.easyhelp.repository;

import com.ticket_tool.easyhelp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);
    


    public List<User> filterUsers(String filter) {
            
        String consulta = "from User u  where u.name like :filter  order by u.name";
        TypedQuery<Usuario> query = this.getEntityManager().createQuery(consulta, User.class);
        
        query.setParameter("filter", "%" + filter + "%");
        
        return query.getResultList();
    }

    public User lerPorLogin(String login) {
        User resultado;

        Query consulta = this.getEntityManager().createQuery("from User u where u.login = :login");
        consulta.setParameter("login", login);

        try {
            resultado = (User) consulta.getSingleResult();
        }

        catch (NoResultException e) {
            resultado = null;
        }

        return resultado;
    } 

}