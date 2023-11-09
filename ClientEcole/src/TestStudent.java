
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.IDao;
import entities.Filiere;
import entities.Student;

public class TestStudent {

    public static IDao<Student> lookUpStudentRemote() throws NamingException {
        final Hashtable<String, String> jndiProperties = new Hashtable<>();
        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
        jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
        final Context context = new InitialContext(jndiProperties);

        return (IDao<Student>) context.lookup("ejb:/EcoleServer/StudentService!dao.IDao");
    }

    public static void main(String[] args) {
        try {
            IDao<Student> dao = lookUpStudentRemote();
//            IDao<Filiere> dao1 = lookUpStudentRemote();

//            dao.create(new Filiere());
            dao.create(new Student("login1","password1","yassir","friha","tel"));
            dao.findAll();
           
            
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}

