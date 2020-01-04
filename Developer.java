
/**
 * Write a description of class Developer here.
 *
 * Sirjan Baniya
 * @id (NP01CP4A180058)
 */
public class Developer
{

    //declaring instance variables
    String platform;
    String interviewername;
    String developername;
    int workinghours;
    
    //defining the constructor with parameters
    public Developer(String platform,String interviewername,int workinghours)
    {
        this.platform=platform;
        this.interviewername=interviewername;
        this.workinghours=workinghours;
        this.developername="";
    }
    //creating getter method for Platform 
    public String getplatform(){ 
        return platform;
    }
    //creating getter method for InterviewerName
    public String getinterviewername(){
        return interviewername;
    }
    //creating getter method for WorkingHours
    public int getworkinghours(){ 
        return workinghours;
    }
    public String getdevelopername(){ //method to get the name of developer
        return developername;
    }
    //using setter method
    public void setdevelopername(String developername){ //method to set the name of developer
        this.developername=developername;
    }
    //displaying the result
    //method to display the information of developer
    public void display(){ //method to display the information of developer
        System.out.println("The platform is:"+getplatform());
        System.out.println("The interviewer name is:"+getinterviewername());
        System.out.println("Total working hours is:"+getworkinghours());
        //checking conditions
        if(!developername.equals("")){ 
            System.out.println("The name of developer is:"+getdevelopername());
        }
        
        }
    }
            
        
        
        
        
        
    
        
    
    
    
    
    
    
    
    
    


























