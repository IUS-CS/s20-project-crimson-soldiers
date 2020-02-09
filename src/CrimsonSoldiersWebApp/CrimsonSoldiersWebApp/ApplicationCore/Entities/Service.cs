namespace CrimsonSoldiersWebApp.ApplicationCore.Entities
{
     // This model class represents the data the app manages. Each field represents a column on Service Table.
     public class Service
     {
          public long Id { get; set; }
          public string Name { get; set; }
          public string Location { get; set; }
          public string Hours { get; set; }
          public string PhoneNumber { get; set; }
          public string Email { get; set; }
          public string ImageUrl { get; set; }
          public string ShortDescription { get; set; } // To be used on Listing Page
          public string LongDescription { get; set; } // To be used on Services Description Page
     }
}