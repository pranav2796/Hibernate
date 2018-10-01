# Hibernate

Steps to follow to setup Hibernet

# Step 1
Create the hibernate.cfg.xml file
(available in the repo)

# Step 2
Add the reuired hibernet libraries
Download from the following website : http://hibernate.org/orm/releases/5.3/

# Step 3
Create Model Class having the Entity(class) and attributes (column name) and their getter setters.

# Step 4
Include the Model class in the configuration file(hibernate.cfg.xml).
(Example attached in repo : StudentInfo.java)

# Step 5 
Copy paste the HibernateUtil.java file in the src folder of the project.

# Step 6
Create Main Class to set the value to the attributes and to save the values to the database.
(Example attached in repo : MainInsert.java)
