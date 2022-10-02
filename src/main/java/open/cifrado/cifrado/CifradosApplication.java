package open.cifrado.cifrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CifradosApplication {

    public static void main(String[] args) {
        SpringApplication.run(CifradosApplication.class, args);
        try {
            System.out.println("Succesfull Connection");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
