using CrimsonSoldiersWebApp.ApplicationCore.Entities;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CrimsonSoldiersWebApp.Infrastructure.Data
{
     public class CrimsonContextSeed
     {
          public static async Task SeedAsync(CrimsonContext context)
          {
               await context.Database.EnsureCreatedAsync();

               if (!context.Services.Any())
               {
                    context.Services.AddRange(GetServices());
                    await context.SaveChangesAsync();
               }
          }

          private static IEnumerable<Service> GetServices()
          {
               return new List<Service>()
               {
                    new Service()
                    {
                         Name = "IUS Police",
                         Location = "UC North Room 027",
                         Hours= "24/7",
                         PhoneNumber = "812-941-2400",
                         Email = string.Empty,
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },

                    new Service()
                    {
                         Name = "Writing Center",
                         Location = "Knobview Room 237",
                         Hours= "M-Thu 8a-7p, F 8a-2p",
                         PhoneNumber = "812-941-2498",
                         Email = "iuswrite@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Math Lab",
                         Location = "Physical Science Room 015",
                         Hours= "M-T 8a-9p,F 10a-3p",
                         PhoneNumber = "812-941-2670",
                         Email = "dcochran@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Student Success Center",
                         Location = "UC South Room 203",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2312",
                         Email = "sessc@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Computer Science Tutors",
                         Location = "Life Science Room 115",
                         Hours= "Varies",
                         PhoneNumber = string.Empty,
                         Email = string.Empty,
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Ogle Center",
                         Location = "Knobview",
                         Hours= string.Empty,
                         PhoneNumber = "812-941-2525",
                         Email = "oglemail@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Bursar",
                         Location = "UC South Room 103",
                         Hours= "M-F 9a-5p",
                         PhoneNumber = "812-941-2100",
                         Email = "sesc@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Financial Aid",
                         Location = "UC South Room 103",
                         Hours= "M-F 9a-5p",
                         PhoneNumber = "812-941-2100",
                         Email = "sesc@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Campus Life",
                         Location = "UC South Room 010",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2316",
                         Email = "seact@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Conference & Catering",
                         Location = "University Center",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2155",
                         Email = "ldalhoff@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Library",
                         Location = "Library Building",
                         Hours= "M-Thu 8a-10p, F 8a-5p",
                         PhoneNumber = "812-941-2489",
                         Email = "maccardi@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Housing",
                         Location = "Meadow Lodge 103",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2115",
                         Email = "liveon@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "Career Development Center",
                         Location = "UC South Room 106",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2489",
                         Email = "webjob@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service()
                    {
                         Name = "School of Business",
                         Location = "Hillside Hall Room 214",
                         Hours= "M-T 8a-5p, F 8a-12p",
                         PhoneNumber = "8812-941-2362",
                         Email = "business@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "School of Business",
                         Location = "Hillside Hall Room 214",
                         Hours= "M-T 8a-5p, F 8a-12p",
                         PhoneNumber = "812-941-2362",
                         Email = "business@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "School of Education",
                         Location = "Hillside Hall Room 0020",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2385",
                         Email = "soeinfo@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "School of Natural Science",
                         Location = "Life Science Room 258",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2284",
                         Email = "natsci@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "School of Arts & Letters",
                         Location = "Knobview Room 110s",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2342",
                         Email = "arladvis@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "School of Nursing ",
                         Location = "Life Science Room 276",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2283",
                         Email = "senurs@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "School of Aces",
                         Location = "UC South Room 106",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2642",
                         Email = "aceadvis@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "School of Social Sciences",
                         Location = "Crestview Hall Room 140",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2391",
                         Email = "sesocs1@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Tech Services",
                         Location = "UC South Room 212",
                         Hours= "M-Thu 8a-8p, F 8a-5p",
                         PhoneNumber = "812-941-2447",
                         Email = "helpdesk@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Veterans Services",
                         Location = "UC South Room 107",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2535",
                         Email = "howellj@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Testing & Disability Services",
                         Location = "UC South Room 207",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2243",
                         Email = "mtspring@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Accounting Services",
                         Location = "UC South Room 103",
                         Hours= "M-Thu 8a-6p, F 8a-5p",
                         PhoneNumber = "812-941-2950",
                         Email = "seacctsv@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Admissions",
                         Location = "UC South Room 102",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2212",
                         Email = "admissions@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Registrar",
                         Location = "UC South Room 103",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2100",
                         Email = "sesc@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Language Lab",
                         Location = "Knob View Room 236",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2232",
                         Email = "tjambros@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Athletics",
                         Location = "Athletics Building",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2432",
                         Email = "athletics@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Bookstore",
                         Location = "UC South",
                         Hours= "M-F 9a-5p",
                         PhoneNumber = "812-941-2250",
                         Email = "athletics@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    },
                    new Service
                    {
                         Name = "Adult Student Center",
                         Location = "UC South Room 206",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2650",
                         Email = "kpelle@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = string.Empty,
                         LongDescription = string.Empty
                    }
               };
          }
     }
}