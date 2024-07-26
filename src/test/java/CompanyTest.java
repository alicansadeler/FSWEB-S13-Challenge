import org.example.Company;
import org.example.Employee;
import org.example.Healthplan;
import org.example.enums.Plan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ResultAnalyzer.class)
public class CompanyTest {

    private Healthplan healthplan;
    private Employee employee;
    private Company company;

    @BeforeEach
    void setUp() {
        healthplan = new Healthplan(1, "A Sigorta", Plan.BASIC);
        String[] healthplans = new String[2];
        healthplans[0] = healthplan.getName();
        employee = new Employee(1, "John Doe", "jd@test.com", "1234", healthplans);

        String[] employees = new String[2];
        employees[0] = employee.getFullName();
        company = new Company(1, "Workintech", 1000, employees);
    }

    @DisplayName("Healthplan sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testHealthPlanTypesAccessModifiers() throws NoSuchFieldException {
        Field idField = healthplan.getClass().getDeclaredField("id");
        assertEquals(idField.getModifiers(), 2);

        Field nameField = healthplan.getClass().getDeclaredField("name");
        assertEquals(nameField.getModifiers(), 2);

        Field planField = healthplan.getClass().getDeclaredField("plan");
        assertEquals(planField.getModifiers(), 2);
    }

    @DisplayName("Healthplan sınıf değişkenleri doğru tipte mi ?")
    @Test
    public void testHealthPlanInstanceTypes() throws NoSuchFieldException {
        assertThat(healthplan.getId(), instanceOf(Integer.class));
        assertThat(healthplan.getName(), instanceOf(String.class));
        assertThat(healthplan.getPlan(), instanceOf(Plan.class));
    }

    @DisplayName("Plan sınıf değişkenleri doğru tipte mi ?")
    @Test
    public void testPlanInstanceTypes() throws NoSuchFieldException {
        assertThat(healthplan.getPlan().getName(), instanceOf(String.class));
        assertThat(healthplan.getPlan().getPrice(), instanceOf(Integer.class));
    }

    @DisplayName("Employee sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testEmployeeAccessModifiers() throws NoSuchFieldException {
        Field idField = employee.getClass().getDeclaredField("id");
        assertEquals(idField.getModifiers(), 2);

        Field fullNameField = employee.getClass().getDeclaredField("fullName");
        assertEquals(fullNameField.getModifiers(), 2);

        Field emailField = employee.getClass().getDeclaredField("email");
        assertEquals(emailField.getModifiers(), 2);

        Field passwordField = employee.getClass().getDeclaredField("password");
        assertEquals(passwordField.getModifiers(), 2);

        Field healthPlans = employee.getClass().getDeclaredField("healthPlans");
        assertEquals(healthPlans.getModifiers(), 2);
    }

    @DisplayName("Employee sınıf değişkenleri doğru tipte mi ?")
    @Test
    public void testEmployeeInstanceTypes() throws NoSuchFieldException {
        assertThat(employee.getFullName(), instanceOf(String.class));
        assertThat(employee.getEmail(), instanceOf(String.class));
        assertThat(employee.getHealthPlans(), instanceOf(String[].class));
    }

    @DisplayName("addHealthplan method başarılı çalışıyor mu?")
    @Test
    public void testAddHealthplanMethod() throws NoSuchFieldException {
        employee.addHealthPlan(-1, "Test Sigorta");
        assertEquals(!Arrays.asList(employee.getHealthPlans()).contains("Test Sigorta"), true);
        employee.addHealthPlan(0, "Test Sigorta");
        assertEquals(!Arrays.asList(employee.getHealthPlans()).contains("Test Sigorta"), true);
        employee.addHealthPlan(1, "Test Sigorta");
        assertEquals(Arrays.asList(employee.getHealthPlans()).contains("Test Sigorta"), true);
    }

    @DisplayName("Company sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testCompanyAccessModifiers() throws NoSuchFieldException {
        Field idField = company.getClass().getDeclaredField("id");
        assertEquals(idField.getModifiers(), 2);

        Field fullNameField = company.getClass().getDeclaredField("name");
        assertEquals(fullNameField.getModifiers(), 2);

        Field emailField = company.getClass().getDeclaredField("giro");
        assertEquals(emailField.getModifiers(), 2);

        Field healthPlans = company.getClass().getDeclaredField("developerNames");
        assertEquals(healthPlans.getModifiers(), 2);
    }

    @DisplayName("Company sınıf değişkenleri doğru tipte mi ?")
    @Test
    public void testCompanyInstanceTypes() throws NoSuchFieldException {
        assertThat(company.getName(), instanceOf(String.class));
        assertThat(company.getGiro(), instanceOf(Double.class));
    }

    @DisplayName("addEmployee method başarılı çalışıyor mu?")
    @Test
    public void testAddEmployeeMethod() throws NoSuchFieldException {
        company.addEmployee(-1, "Jane");
        assertEquals(!Arrays.asList(company.getDeveloperNames()).contains("Jane"), true);
        company.addEmployee(0, "Jane");
        assertEquals(!Arrays.asList(company.getDeveloperNames()).contains("Jane"), true);
        company.addEmployee(1, "Jane");
        assertEquals(Arrays.asList(company.getDeveloperNames()).contains("Jane"), true);
    }
}
