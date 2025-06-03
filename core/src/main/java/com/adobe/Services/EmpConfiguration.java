package com.adobe.Services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name= "EmpConfiguration")
public @interface EmpConfiguration {
    @AttributeDefinition(

    name = "Saradhi",
    description="Saradhi is a good boy",
    required=true
    )

    public String empName();

    @AttributeDefinition(

    name = "300",
    description="this is my lucky number",
    required=true
    )

    public int empId();

     @AttributeDefinition(

    name = "300000",
    description="this is good salary",
    required=true
    )

    public double empSalary();



    

}
