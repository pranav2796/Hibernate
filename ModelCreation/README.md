# Hibernate

Steps to follow to setup Hibernate :
### Step 1
Create the hibernate.cfg.xml file
(Available in the ModelCreation directory)

### Step 2
Add the required hibernate libraries
Download from the following website : http://hibernate.org/orm/releases/5.3/

### Step 3
Create Model Class having the Entity(class) and attributes(column name) and their getter setters.

### Step 4
Include the Model class in the configuration file(hibernate.cfg.xml).
(Example available in the ModelCreation directory : StudentInfo.java)

### Step 5 
Copy paste the HibernateUtil.java file in the src folder of the project.
(Available in the ModelCreation directory)

### Step 6
Create Main Class to set the value to the attributes and to save the values to the database.
(Example available in the ModelCreation directory : MainInsert.java)
