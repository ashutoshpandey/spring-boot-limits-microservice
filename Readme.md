# Project info

- This project uses *spring cloud client* to connect to another project running *spring cloud server*


- The spring cloud server runs on *http://localhost:8888*


- The *bootstrap.properties* file defines following two keys:


    spring.cloud.config.uri => where spring cloud server is running

    spring.application.name => what configuration we want to run (dev, qa, prod etc.)

    spring.profiles.active => what configuration we want to run (dev, qa, prod etc.) if we don't want to control by changing *spring.application.name*

    Note: The name of spring.application.name should match name of property files on config server


- The class with @ConfigurationProperties defines the properties group we want to map