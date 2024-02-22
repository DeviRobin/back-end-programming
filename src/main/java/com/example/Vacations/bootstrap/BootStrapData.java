package com.example.Vacations.bootstrap;

import com.example.Vacations.dao.CustomerRepository;
import com.example.Vacations.dao.DivisionRepository;
import com.example.Vacations.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

   public final DivisionRepository divisionRepository;

   public final CustomerRepository customerRepository;

    public BootStrapData(DivisionRepository divisionRepository, CustomerRepository customerRepository) {
        this.divisionRepository = divisionRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (customerRepository.count()==1) {
            Customer customer1 = new Customer();
            customer1.setFirstName("Daisy");
            customer1.setLastName("Doe");
            customer1.setAddress("913 Rhett Key");
            customer1.setPostal_code("54167");
            customer1.setPhone("6686675112");
            customer1.setDivision(divisionRepository.findAll().get(1));
            customer1.setCreate_date(new Date());
            customer1.setLast_update(new Date());
            customerRepository.save(customer1);

            Customer customer2 = new Customer();
            customer2.setFirstName("Sunflower");
            customer2.setLastName("Ceed");
            customer2.setAddress("Suite 975 5291 Paucek Burg");
            customer2.setPostal_code("84905");
            customer2.setPhone("2488574136");
            customer2.setDivision(divisionRepository.findAll().get(2));
            customer2.setCreate_date(new Date());
            customer2.setLast_update(new Date());
            customerRepository.save(customer2);

            Customer customer3 = new Customer();
            customer3.setFirstName("Cherry");
            customer3.setLastName("Blossom");
            customer3.setAddress("776 Marquis Prairie");
            customer3.setPostal_code("68210");
            customer3.setPhone("2128307405");
            customer3.setDivision(divisionRepository.findAll().get(3));
            customer3.setCreate_date(new Date());
            customer3.setLast_update(new Date());
            customerRepository.save(customer3);

            Customer customer4 = new Customer();
            customer4.setFirstName("Cake");
            customer4.setLastName("Pop");
            customer4.setAddress("2751 Vandervort Underpass");
            customer4.setPostal_code("71901");
            customer4.setPhone("7722781523");
            customer4.setDivision(divisionRepository.findAll().get(4));
            customer4.setCreate_date(new Date());
            customer4.setLast_update(new Date());
            customerRepository.save(customer4);

            Customer customer5 = new Customer();
            customer5.setFirstName("Blueberry");
            customer5.setLastName("Cheesecake");
            customer5.setAddress("735 Gloria Harbors");
            customer5.setPostal_code("78204");
            customer5.setPhone("3070171473");
            customer5.setDivision(divisionRepository.findAll().get(5));
            customer5.setCreate_date(new Date());
            customer5.setLast_update(new Date());
            customerRepository.save(customer5);

            System.out.println("Sample customers added");
        }
        else {
            System.out.println("Sample customers not needed");
        }
    }
}
