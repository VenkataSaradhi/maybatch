package com.adobe.Services;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate =true,enabled =true ,service= EmployeeConfigurationsImpl.class)

@Designate(ocd=EmpConfiguration.class)
public class EmployeeConfigurationsImpl {


    public String empName;

     public int empId;

     public double empSal;

     @Reference
     EmpConfiguration empConfiguration;

     private static final Logger LOG=LoggerFactory.getLogger(EmployeeConfigurationsImpl.class);

     @Activate
     public void activate( EmpConfiguration empConfiguration)
     {
            updateConfiguration(empConfiguration);
     }
     @Deactivate
     public void deactivate( EmpConfiguration empConfiguration)
     {
            updateConfiguration(empConfiguration);
     }
     @Modified
     public void modified( EmpConfiguration empConfiguration)
     {

            updateConfiguration(empConfiguration);
     }
     public void updateConfiguration( EmpConfiguration empConfiguration)
     {
            this.empName=empConfiguration.empName();

            this.empId=empConfiguration.empId(); 

            this.empSal=empConfiguration.empSalary();   

            LOG.info("Employee Name: " + empName);  
            LOG.info("Employee ID: " + empId);  
            LOG.info("Employee Salary: " + empSal); 


     }

     }
    

     





