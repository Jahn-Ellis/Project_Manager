package task7;

import java.time.LocalDate;
import java.util.*;

public class Poised {

    public static void main(String[] args) {

        Scanner selector = new Scanner(System.in);
        int select;
        String menuSelect;

        // Driver Code
        while (true) {
            menu();
            System.out.println("\nSelect an action:");
            select = selector.nextInt();
            if (select == 1) {
                createCustomer();
                createProject();
                createArchitect();
                createContractor();
                printProject();
            } else if (select == 2) {
                updateDeadline();
            } else if (select == 3) {
                updatePayments();
            } else if (select == 4) {
                updateContractor();
            } else if (select == 5) {
                finaliseProject();
            } else if (select == 0)
                break;
        }

    }

    public static void menu() {

        System.out.println("Poised Project Manager" +
                "\n" +
                "\n1 - Create project" +
                "\n2 - Update project deadline" +
                "\n3 - Update payments" +
                "\n4 - Update contractor details" +
                "\n5 - Finalise project" +
                "\n0 - Exit");

    }

    public static void createCustomer() {

        Scanner Input = new Scanner(System.in);

        System.out.println("\nEnter Customer name:");
        String name = Input.nextLine();

        System.out.println("\nEnter Customer surname:");
        String surname = Input.nextLine();

        System.out.println("\nEnter Customer contact:");
        int contact = Input.nextInt();

        Input.nextLine(); // Fix skip error

        System.out.println("\nEnter Customer email:");
        String email = Input.nextLine();

        System.out.println("\nEnter Customer address:");
        String address = Input.nextLine();

        ContactDetailsCustomer Customer = new ContactDetailsCustomer(name, surname, contact, email, address);

        System.out.println("\nCustomer Details:\n" + Customer);
    }

    public static void createProject() {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a project number:");
        int projectNum = Input.nextInt();

        Input.nextLine(); // Fix skip error

        System.out.println("\nEnter project name:");
        String projectName = Input.nextLine();

        System.out.println("\nEnter building type:" +
                "\nResidential" +
                "\n\tHouse" +
                "\n\tApartment Block" +
                "\n\tContainer Home" +
                "\nBusiness" +
                "\n\tOffice Building" +
                "\n\tOffice Renovation" +
                "\nEducational" +
                "\n\tSchool" +
                "\n\tUniversity" +
                "\n\tCollege" +
                "\nMercantile" +
                "\n\tMall" +
                "\n\tShop" +
                "\n\tRestaurant" +
                "\nIndustrial" +
                "\n\tFactory" +
                "\n\tWarehouse" +
                "\n\tRefinery" +
                "\nAssembly" +
                "\n\tStadium" +
                "\n\tMuseum" +
                "\n\tClub" +
                "\n\tGym");
        String buildingType = Input.nextLine();

        System.out.println("\nEnter site address:");
        String address = Input.nextLine();

        System.out.println("\nEnter ERF number:");
        int ERFNum = Input.nextInt();

        System.out.println("\nTotal cost of project:");
        double feesCost = Input.nextDouble();

        System.out.println("\nAmount paid to date by customer:");
        double feesPaid = Input.nextDouble();

        Input.nextLine(); // Fix skip error

        System.out.println("\nProject deadline:");
        String deadline = Input.nextLine();

        // Auto-assign incomplete status
        String status = "Incomplete";

        LocalDate completionDate = null;

        // Project name check and generation
        if (projectName.isEmpty())
            projectName = buildingType + " " + ContactDetailsCustomer.getSurname();

        ProjectDetails Project = new ProjectDetails(projectNum, projectName, buildingType, address,
                ERFNum, feesCost, feesPaid, deadline, status, completionDate);

        System.out.println("\nProject Details:\n" + Project);
    }

    public static void createArchitect() {

        Scanner Input = new Scanner(System.in);

        System.out.println("\nEnter Architect name:");
        String name = Input.nextLine();

        System.out.println("\nEnter Architect surname:");
        String surname = Input.nextLine();

        System.out.println("\nEnter Architect contact:");
        int contact = Input.nextInt();

        Input.nextLine(); // Fix skip error

        System.out.println("\nEnter Architect email:");
        String email = Input.nextLine();

        System.out.println("\nEnter Architect address:");
        String address = Input.nextLine();

        ContactDetailsArchitect Architect = new ContactDetailsArchitect(name, surname, contact, email, address);

        System.out.println("\nArchitect Details:\n" + Architect);
    }

    public static void createContractor() {

        Scanner Input = new Scanner(System.in);

        System.out.println("\nEnter Contractor name:");
        String name = Input.nextLine();

        System.out.println("\nEnter Contractor surname:");
        String surname = Input.nextLine();

        System.out.println("\nEnter Contractor contact:");
        int contact = Input.nextInt();

        Input.nextLine(); // Fix skip error

        System.out.println("\nEnter Contractor email:");
        String email = Input.nextLine();

        System.out.println("\nEnter Contractor address:");
        String address = Input.nextLine();

        ContactDetailsContractor Contractor = new ContactDetailsContractor(name, surname, contact, email, address);

        System.out.println("\nContractor Details:\n" + Contractor);
    }

    public static void printProject() {

        System.out.println("\nProject Details:");
        System.out.println("Project Number: " + ProjectDetails.getprojectNum());
        System.out.println("Project Name: " + ProjectDetails.getprojectName());
        System.out.println("Building Type: " + ProjectDetails.getBuildingType());
        System.out.println("Project Address: " + ProjectDetails.getAddress());
        System.out.println("Project ERF Number: " + ProjectDetails.getERFNum());
        System.out.println("Project Cost: " + ProjectDetails.getFeesCost());
        System.out.println("Amount Paid to Date: " + ProjectDetails.getFeesPaid());
        System.out.println("Project Deadline: " + ProjectDetails.getDeadline());
        System.out.println("Project Status: " + ProjectDetails.getStatus());

        System.out.println("\nCustomer Details:");
                System.out.println("Customer Name: " + ContactDetailsCustomer.getName() +
                " " +ContactDetailsCustomer.getSurname());
        System.out.println("Customer Contact: " + ContactDetailsCustomer.getContact());
        System.out.println("Customer Email: " + ContactDetailsCustomer.getEmail());
        System.out.println("Customer Address: " + ContactDetailsCustomer.getAddress());

        System.out.println("\nArchitect Details:");
        System.out.println("Architect Name: " + ContactDetailsArchitect.getName() +
                " " +ContactDetailsArchitect.getSurname());
        System.out.println("Architect Contact: " + ContactDetailsArchitect.getContact());
        System.out.println("Architect Email: " + ContactDetailsArchitect.getEmail());
        System.out.println("Architect Address: " + ContactDetailsArchitect.getAddress());

        System.out.println("\nContractor Details:");
        System.out.println("Contractor Name: " + ContactDetailsContractor.getName() +
                " " +ContactDetailsContractor.getSurname());
        System.out.println("Contractor Contact: " + ContactDetailsContractor.getContact());
        System.out.println("Contractor Email: " + ContactDetailsContractor.getEmail());
        System.out.println("Contractor Address: " + ContactDetailsContractor.getAddress());

    }

    public static void updateDeadline() {

        int projectNum = ProjectDetails.getprojectNum();
        String projectName = ProjectDetails.getprojectName();
        String buildingType = ProjectDetails.getBuildingType();
        String address = ProjectDetails.getAddress();
        int ERFNum = ProjectDetails.getERFNum();
        double feesCost = ProjectDetails.getFeesCost();
        double feesPaid = ProjectDetails.getFeesPaid();
        String deadline;
        String status = ProjectDetails.getStatus();
        LocalDate completionDate = ProjectDetails.getCompletionDate();

        Scanner Input = new Scanner(System.in);
        System.out.println("Current Project Deadline: " + ProjectDetails.getDeadline() +
                "Enter a new deadline:");
        deadline = Input.nextLine();

        ProjectDetails Project = new ProjectDetails(projectNum, projectName, buildingType, address,
                ERFNum, feesCost, feesPaid, deadline, status, completionDate);

        System.out.println("The deadline has been updated.");
    }

    public static void updatePayments() {

        int projectNum = ProjectDetails.getprojectNum();
        String projectName = ProjectDetails.getprojectName();
        String buildingType = ProjectDetails.getBuildingType();
        String address = ProjectDetails.getAddress();
        int ERFNum = ProjectDetails.getERFNum();
        double feesCost = ProjectDetails.getFeesCost();
        double feesPaid;
        String deadline = ProjectDetails.getDeadline();
        String status = ProjectDetails.getStatus();
        LocalDate completionDate = ProjectDetails.getCompletionDate();

        Scanner Input = new Scanner(System.in);
        System.out.println("Current Amount Paid to Date: " + ProjectDetails.getDeadline() +
                "\nUpdate Amount:");
        feesPaid = Input.nextDouble();

        ProjectDetails Project = new ProjectDetails(projectNum, projectName, buildingType, address,
                ERFNum, feesCost, feesPaid, deadline, status, completionDate);

        System.out.println("The amount has been updated.");
    }

    public static void updateContractor() {

        String name = ContactDetailsContractor.getName();
        String surname = ContactDetailsContractor.getSurname();
        int contact;
        String email;
        String address = ContactDetailsContractor.getAddress();

        Scanner Input = new Scanner(System.in);
        System.out.println("Contractor Contact: " + ContactDetailsContractor.getContact() +
                "\nContractor Email: " + ContactDetailsContractor.getEmail() +
                "\nEnter new contact:");
        contact = Input.nextInt();
        System.out.println("Enter new email:");
        email = Input.nextLine();

        ContactDetailsContractor Contractor = new ContactDetailsContractor(name, surname, contact, email, address);

        System.out.println("The Contractor contact details have been updated.");
    }

    public static void finaliseProject() {

        int projectNum = ProjectDetails.getprojectNum();
        String projectName = ProjectDetails.getprojectName();
        String buildingType = ProjectDetails.getBuildingType();
        String address = ProjectDetails.getAddress();
        int ERFNum = ProjectDetails.getERFNum();
        double feesCost = ProjectDetails.getFeesCost();
        double feesPaid = ProjectDetails.getFeesPaid();
        String deadline = ProjectDetails.getDeadline();
        String status = ProjectDetails.getStatus();
        LocalDate completionDate;

        if (ProjectDetails.getFeesPaid() <= ProjectDetails.getAmountDue()) {
            System.out.println("\n***Invoice***");

            System.out.println("\nCustomer Details:");
            System.out.println("Customer Name: " + ContactDetailsCustomer.getName() +
                    " " + ContactDetailsCustomer.getSurname());
            System.out.println("Customer Contact: " + ContactDetailsCustomer.getContact());
            System.out.println("Customer Email: " + ContactDetailsCustomer.getEmail());
            System.out.println("Customer Address: " + ContactDetailsCustomer.getAddress());

            System.out.println("Amount Due: " + ProjectDetails.getAmountDue());
        } else
            projectNum = ProjectDetails.getprojectNum();
            projectName = ProjectDetails.getprojectName();
            buildingType = ProjectDetails.getBuildingType();
            address = ProjectDetails.getAddress();
            ERFNum = ProjectDetails.getERFNum();
            feesCost = ProjectDetails.getFeesCost();
            feesPaid = ProjectDetails.getFeesPaid();
            deadline = ProjectDetails.getDeadline();
            status = "Finalised";
            completionDate = LocalDate.now();

            ProjectDetails Project = new ProjectDetails(projectNum, projectName, buildingType, address,
                    ERFNum, feesCost, feesPaid, deadline, status, completionDate);

        System.out.println("\nProject Details:");
        System.out.println("Project Number: " + ProjectDetails.getprojectNum());
        System.out.println("Project Name: " + ProjectDetails.getprojectName());
        System.out.println("Building Type: " + ProjectDetails.getBuildingType());
        System.out.println("Project Address: " + ProjectDetails.getAddress());
        System.out.println("Project ERF Number: " + ProjectDetails.getERFNum());
        System.out.println("Project Cost: " + ProjectDetails.getFeesCost());
        System.out.println("Amount Paid to Date: " + ProjectDetails.getFeesPaid());
        System.out.println("Project Deadline: " + ProjectDetails.getDeadline());
        System.out.println("Project Status: " + ProjectDetails.getStatus());
        System.out.println("Completion Date: " + ProjectDetails.getCompletionDate());
    }
}
