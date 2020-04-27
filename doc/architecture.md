# CrimsonSoldiersWebApp
**Software Architecture Document**  
**Version 1.0**  
-----------------------------------

## Introduction and Purpose
This document provides a high-level overview of the application's architecture, the use cases supported and components that have been selected to best achieve them. 

## Architecture Overview 

In our system, the user sends requests over HTTPS to an Angular front-end framework. This angular application then interfaces with our web API in order to access the SQL database wich is hosted on an Azure server.

![System Flow Diagram](https://github.com/IUS-CS/s20-project-crimson-soldiers/blob/byoungWork/doc/System%20flow%20diagram.JPG)

## Use-Case View  
![Use-Case Diagram](https://github.com/IUS-CS/s20-project-crimson-soldiers/blob/byoungWork/doc/use-case.png)  
1. Actors  
Our webapp contains 2 major use cases:
    - Listing all on-campus services
    - Finding additional information for a specific service
    - Searching
2. Use Cases  
    - View information
        Short description: This use case allows users to look at and gather information on the various services offered across campus. This includes getting additional information from a popup dialog box. THe actor of this use case is the end consumer of this webapp.


## Service View 
1. Repository

2. Services




