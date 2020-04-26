# s20-project-crimson-soldiers

The **s20-project-crimson-soldiers** is for anyone needing information regarding Indiana University Southeast services and/or offices. This Web-based application will act as a search engine providing location, hours, phone number, email and description. The intent is to create a tool that could help faculty, students, and even visitors needing to get more information quickly, and in one place, for all IUS services. Unlike another services somewhat similar, the focus is on services specifically at IUS, so every other IU campus is not included. 
There is a Home/Listing page with a search option showing: service name, brief descriptions and logo for the all the services and offices available at IUS. Once a specific service is selected a modal displaying more detailed information will appeared. 
This site will be using ASP.NET Web API for the back-end framework along with Angular for the front-end. The package bundler used is the Angular CLI. With that being said, Microsoft.EntityFrameworkCore.SqlServer will be the object-relational mapping framework.

## Prerequisites

* Visual Studio 2019 or 2017
* .NET Core 3.1 SDK or newer
* Node `v12.15.0`
* Angular CLI `9.0.1`
* EntityFrameworkCore `3.1.1`

## Getting Started

To run this application locally:
- Clone the repository.
- Install node v12.15.0 LTS ( https://nodejs.org/en/ )
- Ensure you have the correct .NET CORE SDK version (in the command line run `dotnet --version`)
- Install @angular/cli@9.0.1 (https://cli.angular.io/ )
- Ensure your project Builds.

## Merge Requests & Builds

Merge requests should be open against the `master` branch with a proper description of changes. Pier review is required before changes can be merged in.

## Application and File Structure

This App was developed using the Net Core Angular template. The template is equivalent to creating an ASP.NET Core project to act as an API back-end and an Angular CLI project to act as a UI. The template offers the convenience of hosting both project types in a single app project. Consequently, the app project can be built and published as a single unit.

> Files

1. **wwwroot:** It is the folder, where we put the public assets (Static files and Libraries) for our application for the client side. E.g. Images, Fonts, Icons, and etc. So, these static files and libraries are accessible right from the root of the project.

2. **Program.cs:** This ASP.NET Core class is where our application starts. When you open this file you will see that this class contains a `Main()` method which the entry point of the application. It is also the place to create a host for the web application.

3. **Startup.cs:** It is executed first when the application starts. It is a place where you can register your dependent classes with the built-in IoC container and configure application request pipeline. It contains 2 methods `ConfigureServices()` and `Configure()`. This class is basically used for configure middle-wares on the request pipeline. We also use this class as a Dependency Injection Container for ASP.NET Core.

4. **Controllers:** Contains the API controller of the application.

5. **Core/Entities:** Entities of the application, used as DbSet for EF.

6. **Infrastructure/Data:** `DbContext` configuration and Data Access Layer of the application.

7. **Pages:** Web Default pages for Errors not handled by the application.

8. **Migrations:** Folder and classes created automatically by EF.

9. **appsettings.json:** This is where we store our application settings.

10. **ClientApp:** Where we have all the client-side code of the angular app.
	   - `package.json`: Configures npm package dependencies that are available to the project in the workspace.
	   - `angular.json`: CLI configuration defaults for all projects in the workspace, including configuration options for build, serve, and test tools that the CLI uses.
	   - `src`: Source files for the root-level application project. This is where the angular code will be written.

## Testing Setup

1.	Download Maven build files: https://maven.apache.org/download.cgi
2.	Navigate to System Properties **->** Advanced System Settings **->** Environment Variable **->** System Variable **->** New **->** Add path of Maven folder.
    - Setup JAVA_HOME variable to point to systems jdk bin folder, download jdk if not already installed.
    - Add jdk bin path to “Path” variables.
    - Create M2_HOME system variable with path set to apache-maven folder.
    - Create M2 system variable with path set to apache-maven bin folder.
    - Verify Maven is installed correctly with command: mvn –version.
3.	Add TestNG plug-in to your IDE.
4.	Download chrome driver: https://chromedriver.storage.googleapis.com/index.html?path=80.0.3987.106/
    - Go inside project, open CommonDriverClass file located within the setup package. Line 29 or so, replace populated driver path with your chrome driver path. 

## Build Notes

This App has been built with Net Core, all DotNet commands are available (`dotnet help` to view them all).

- **Building:** run `dotnet build`, it will restore `npm`dependencies if necessary (npm install). 
- **Running:** run `dotnet run`, it will print a message in the console _Now listening on: http://localhost:<port>"_ 
               Navigate to that url to see the app, it runs `ng build` on the back to create angular output files.
  
Also all Angular CLI and `npm` commands are available. Go to cd/ClientApp to execute them all (`ng help` to view them all).
- **Install new package:** `npm install —save <package name>`
- `ng serve`: to run UI app.
- `ng build`: to build output files.

Visual Studio: to execute all the commands click on **Build** and **Run**.

## Design Patterns

- Singleton
- Command
- Dependency injection
- Repository

## Publishing

The App is hosted in Azure Cloud Service. 
- **App URL:** https://crimsonsoldiers-iusservicelisting.azurewebsites.net/

## Built With
- ASP.NET Web API : Back-End Framework.
- Angular : Front-End Framework.
- Angular CLI (Webpack) : Package bundler.
- TypeScript : A superset of JavaScript that compiles to plain JavaScript ( http://www.typescriptlang.org/ ).
- Microsoft.EntityFrameworkCore.SqlServer : Object-relational mapping framework.
