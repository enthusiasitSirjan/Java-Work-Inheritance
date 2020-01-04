
/**
 * Write a description of class SeniorDeveloper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeniorDeveloper extends Developer
{
    //declaring instance variable
    int salary;
    String joiningdate;
    String staffroomnumber;
    int contractperiod;
    float advancesalary;
    boolean appointed;
    boolean terminated;
    //making a constructor
    public SeniorDeveloper(String platform,String interviewername,int salary,int contractperiod,int workinghours )
    {
        super(platform,interviewername,workinghours);//using the concept of inheritance
        this.salary=salary;
        this.contractperiod =contractperiod;
        this.joiningdate="";
        this.staffroomnumber="";
        this.advancesalary=0.0f;
        this.appointed=false;
        this.terminated=false;
    }
    //using getter methods
    public int getsalary(){ //method to get salary
        return salary;
    }
    public int getcontractperiod(){ //method to get contract period
        return contractperiod;
    }
    public String getjoiningdate(){ //method to get joining date 
        return joiningdate;
    }
    public String getstaffroomnumber(){ //method to get staff room  number
        return staffroomnumber;
    }
    public float getadvancesalary(){ //method to get advance salary
        return advancesalary;
    }
    public boolean getappointed(){ //method to get the appointed status
        return appointed;
       
    }
    public boolean getterminated(){ //method to get termination status
        return terminated;
    }
    //using setter methods
    public void setsalary(int salary){//method to set the salary
        this.salary=salary;
        System.out.println("The salary is updated");
    }
        
    //method to set the contract period
    public void setcontractperiod(int contractperiod){
        this.contractperiod=contractperiod;
        System.out.println("Contract period has been updated");
    }
   
    //method to hire the developer with no return type
    public void gethiredeveloper(String developername,String joiningdate,float advancesalary,String staffroomnumber){
        if(appointed){
            System.out.println(getdevelopername()+"is already appointed");
            System.out.println("The room number is"+getstaffroomnumber());
        }
        else{
            super.setdevelopername(developername);
            this.joiningdate=joiningdate;
            this.staffroomnumber=staffroomnumber;
            this.advancesalary=advancesalary;
            appointed=true;
            terminated=false;
        }
    }
    //method for contract termination
    public void getcontracttermination(){
        if(terminated==true){
        System.out.println("Sorry we have terminated your contract"); 
      }
        else{
            setdevelopername("");
            joiningdate="";
            advancesalary=0.0f;
            appointed=false;
            terminated=true;
    }
   }
    //method to print the information of developer 
    public void print()
    {
        System.out.println("Platform is "+getplatform());
        System.out.println("THe name of interviewername is "+getinterviewername());
        System.out.println("The salary of developer  is "+getsalary());
        
    }
    //method with same digital signature as of developer class to display the information of developer
    public void display(){
        super.display();//calling the method from parent class
        if(appointed==true){
            System.out.println("Termination Status:"+getterminated());
            System.out.println("Joining date:"+getjoiningdate());
            System.out.println("Advance salary:"+getadvancesalary());
            System.out.println("Developer name:"+getdevelopername());
        
        }
        
        
    
    
    
    }
        
        
        
    
    
    }
    
        
    
    
    
    
    
    
    
    
    

     
   
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
            
        
        
    
    
    
    
    
    
    
    
        
        
        
        
        
    
    
    
    
    
    
   
    

