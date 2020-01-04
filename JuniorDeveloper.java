
/**
 * Write a description of class JuniorDeveloper here.
 *
 * Sirjan Baniya
 * @id (np01cp4a180058)
 */
public class JuniorDeveloper extends Developer //inheritation concept
{
    //decalaring instanace variables
    int salary;
    String appointeddate;
    String evaluationperiod;
    String terminationdate;
    String specialization;
    String appointedby;
    boolean joined;
    //declaring a consructor
    public JuniorDeveloper(String platform,String interviewername,int workinghours,int salary,String appointedby,String terminationdate)
    {
        super(platform,interviewername,workinghours);//inheritating the parameters of constructor from the parent class
        this.salary=salary;
        this.appointedby=appointedby;
        this.terminationdate=terminationdate;
        this.appointeddate="";
        this.evaluationperiod="";
        this.specialization="";
        joined=false;
    }
    //using getter method
    public int getsalary(){//method to get salary
        return salary;
    }
    public String getappointedby(){//method to get appointed by
        return appointedby;
    }
    public String getterminationdate(){//method to get termination date
        return terminationdate;
    
    }
    public String getevaluationperiod(){//method to get evaluation period
        return evaluationperiod;
    }
    public String getappointeddate(){//method to get appointed date
        return appointeddate;
    }
    public String getspecialization(){//method to get specialization 
        return specialization;
    }
    public boolean getjoined(){//method to get joined status
        return joined;
    }
    //using setter method for specialization
    public void setspecialization(String specialization){
        this.specialization=specialization;
    }
    //using stter method for appointed date
    public void setappointeddate(String appointeddate){
        this.appointeddate=appointeddate;
    }
    //using setter method for terminationdate
    public void setterminationdate(String terminationdate){
        this.terminationdate=terminationdate;
    }
   
    //using setter method with no return type
    public void setsalary(int salary){//method to set salary
     if(joined==true){
            System.out.println("Sorry , We Cannot change the salary for already appointed person");
       
    }
    else if(joined==false){
        this.salary=salary;
    
    }
    }  
    public void setappointedby(String appointedby){//method to set appointed by
        this.appointedby=appointedby;
     }
   //method to appoint a developer 
    public void appointdeveloper(String developername,String appointeddate,String terminationdate,String specialization)
    {
        if(joined==false){
            super.setdevelopername(developername);//calling a method with parameter from the parent class
            joined=true;
        }
        else {
            System.out.println("The person has already joined");
            System.out.println("The appointed date is"+getappointeddate());
        }
        this.appointeddate=appointeddate;
        this.terminationdate=terminationdate;
        this.specialization=specialization;
     }
    //method with same digital signature as of parent class to display the information of developer
    public void display(){
        super.display();//calling a method from parent class
        if(joined==true){
            System.out.println("The appointed date is "+getappointeddate());
            System.out.println("The evaluation period is "+getevaluationperiod());
            System.out.println("The termination date is "+getterminationdate());
            System.out.println("The salary of developer is "+getsalary());
            System.out.println("The specialization of developer is "+getspecialization());
            System.out.println("The developer is appointed by "+getappointedby());
        }
    }
    
}
   
    
    

    
        
            
            
            
            
        
        
            
        
        
            
            
        
        
        
        
        
       
    
    
    
        
    
    
    
    
    
    
    
    

    
        
    
    
    
    
    
    
    

