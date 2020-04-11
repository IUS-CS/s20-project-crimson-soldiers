using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace CrimsonSoldiersWebApp.ApplicationCore.Entities
{
     // This model class represents the data the app manages. Each field represents a column on Service Table.
     public class Service
     {
          [Key]
          [DatabaseGenerated(DatabaseGeneratedOption.Identity)] //to auto generate key/id
          public long Id { get; set; }
          [Required]
          public string Name { get; set; }
          public string Location { get; set; }
          public string Hours { get; set; }
          [StringLength(15)]
          public string PhoneNumber { get; set; }
          public string Email { get; set; }
          public string ImageUrl { get; set; }
          [StringLength(100)]
          public string ShortDescription { get; set; } // To be used on Listing Page
          [StringLength(300)]
          public string LongDescription { get; set; } // To be used on Services Description Page
     }
}