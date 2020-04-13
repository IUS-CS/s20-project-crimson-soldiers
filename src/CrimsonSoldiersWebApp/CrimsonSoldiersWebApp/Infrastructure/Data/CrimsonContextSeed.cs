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
                         Email = "sfmiller@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/police.jpg,
                         ShortDescription = "Anything from parking tickets, crime reporting or general campus information",
                         LongDescription = "The IUS Police are Indiana State Troopers that are on the campus and patrolling 24/7. They also have cadets who control and give out the parking tickets. The police station works like any other police station when it comes to tickets and reporting crimes. "
                    },

                    new Service()
                    {
                         Name = "Writing Center",
                         Location = "Knobview Room 237",
                         Hours= "M-Thu 8a-7p, F 8a-2p",
                         PhoneNumber = "812-941-2498",
                         Email = "iuswrite@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = "Get help with writing and revising papers",
                         LongDescription = "The Writing Center provides staff that is readily available to help students with writing essays and can even help critique ones' resume."
                    },
                    new Service()
                    {
                         Name = "Math Lab",
                         Location = "Physical Science Room 015",
                         Hours= "M-T 8a-9p,F 10a-3p",
                         PhoneNumber = "812-941-2670",
                         Email = "dcochran@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = "Get help with math courses and it acts as a location to make up tests",
                         LongDescription = "The Math Lab provides tutors for all math courses to help students with their homework and giving them more examples to help understand problems. The Math Lab also provides a place to  make up math tests."
                    },
                    new Service()
                    {
                         Name = "Student Success Center",
                         Location = "UC South Room 203",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2312",
                         Email = "sessc@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = "Help students maintain a success path",
                         LongDescription = "The Student Success Center help students learn about different services available on campus. The center also provides tutoring and testing services."
                    },
                    new Service()
                    {
                         Name = "Computer Science Tutors",
                         Location = "Life Science Room 115",
                         Hours= "Varies",
                         PhoneNumber = "812-941-2284",
                         Email = "jfdoyle@iu.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = "Get help with Computer Science courses",
                         LongDescription = "The Computer Science tutors are volunteer students who help lower level students with classes that the tutor is beyond efficient in."
                    },
                    new Service()
                    {
                         Name = "Ogle Center",
                         Location = "Knobview",
                         Hours= string.Empty,
                         PhoneNumber = "812-941-2525",
                         Email = "oglemail@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/ogle.jpg,
                         ShortDescription = "Art Center where plays and concerts are held",
                         LongDescription = "Ogle Center is location in the Knobview building and has auditoriums that host different plays and concerts for the public."
                    },
                    new Service()
                    {
                         Name = "Bursar",
                         Location = "UC South Room 103",
                         Hours= "M-F 9a-5p",
                         PhoneNumber = "812-941-2100",
                         Email = "sesc@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/bursar.jpg,
                         ShortDescription = "Office where the University bills the students",
                         LongDescription = "Office where all the payments are sent out to all of the students. Students can also visit the office for payment questions."
                    },
                    new Service()
                    {
                         Name = "Financial Aid",
                         Location = "UC South Room 103",
                         Hours= "M-F 9a-5p",
                         PhoneNumber = "812-941-2100",
                         Email = "sesc@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/financialaid.jpg,
                         ShortDescription = "Office where a student can apply for financial help",
                         LongDescription = "Office where staff helps students with FASFA and other aids in order to help pay for the their schooling."
                    },
                    new Service()
                    {
                         Name = "Campus Life",
                         Location = "UC South Room 010",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2316",
                         Email = "seact@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = "Office where students can learn about organizations to get involved in.",
                         LongDescription = "Campus Life provides an office where students can learn about Greek Life and other organizations on campus. They also act as the judical board for Greek Life."
                    },
                    new Service()
                    {
                         Name = "Conference & Catering",
                         Location = "University Center",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2155",
                         Email = "ldalhoff@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/cafeteria.jpg,
                         ShortDescription = "Office that handles UC reservations and the cafeteria",
                         LongDescription = "Students can reserve rooms in the UC building and can also ask the staff anything to do with cafeteria or catering."
                    },
                    new Service()
                    {
                         Name = "Library",
                         Location = "Library Building",
                         Hours= "M-Thu 8a-10p, F 8a-5p",
                         PhoneNumber = "812-941-2489",
                         Email = "maccardi@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/library.jpg,
                         ShortDescription = "Library where students can study and rent books",
                         LongDescription = "Students can rent books and reserve rooms in the library to study. It also offers staff and other resources to help students."
                    },
                    new Service()
                    {
                         Name = "Housing",
                         Location = "Meadow Lodge 103",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2115",
                         Email = "liveon@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/housing.jpg,
                         ShortDescription = "Office that handles everything with the dorms",
                         LongDescription = "Housing takes care of everything with the dorms such as assigning rooms, assigning RA's and making sure everyone is safe and happy."
                    },
                    new Service()
                    {
                         Name = "Career Development Center",
                         Location = "UC South Room 106",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2489",
                         Email = "webjob@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/career.jpg,
                         ShortDescription = "Students can learn about job opportunities and how to be professional in career fields",
                         LongDescription = "Career Development Center helps students find jobs and internships while also helping students with their resumes."
                    },
                    new Service()
                    {
                         Name = "School of Business",
                         Location = "Hillside Hall Room 214",
                         Hours= "M-T 8a-5p, F 8a-12p",
                         PhoneNumber = "8812-941-2362",
                         Email = "business@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/business.png,
                         ShortDescription = "Office over the Business School",
                         LongDescription = "Office that provides students in the Business school with information and advisors."
                    },
                    new Service
                    {
                         Name = "School of Education",
                         Location = "Hillside Hall Room 0020",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2385",
                         Email = "soeinfo@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/education.png,
                         ShortDescription = "Office over the Education School",
                         LongDescription = "Office that provides students in the Education school with information and advisors."
                    },
                    new Service
                    {
                         Name = "School of Natural Science",
                         Location = "Life Science Room 258",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2284",
                         Email = "natsci@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = "Office over the Natural Sciences School",
                         LongDescription = "Office that provides students in the Natural Science school with information and advisors."
                    },
                    new Service
                    {
                         Name = "School of Arts & Letters",
                         Location = "Knobview Room 110s",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2342",
                         Email = "arladvis@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/arts&letters.jpg,
                         ShortDescription = "Office over the Arts & Letters School",
                         LongDescription = "Office that provides students in the Arts & Letters school with information and advisors."
                    },
                    new Service
                    {
                         Name = "School of Nursing ",
                         Location = "Life Science Room 276",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2283",
                         Email = "senurs@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/nursing.jpg,
                         ShortDescription = "Office over the Nursing School",
                         LongDescription = "Office that provides students in the Nursing school with information and advisors."
                    },
                    new Service
                    {
                         Name = "School of Aces",
                         Location = "UC South Room 106",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2642",
                         Email = "aceadvis@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/aces.jpg,
                         ShortDescription = "Office over the Exploratory Students",
                         LongDescription = "Office that provides students in the ACES school with information and advisors."
                    },
                    new Service
                    {
                         Name = "School of Social Sciences",
                         Location = "Crestview Hall Room 140",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2391",
                         Email = "sesocs1@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = "Office over the Social Sciences School",
                         LongDescription = "Office that provides students in the Social Sciences school with information and advisors."
                    },
                    new Service
                    {
                         Name = "Tech Services",
                         Location = "UC South Room 212",
                         Hours= "M-Thu 8a-8p, F 8a-5p",
                         PhoneNumber = "812-941-2447",
                         Email = "helpdesk@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/IT.png,
                         ShortDescription = "Help desk where students can get tech help",
                         LongDescription = "Tech services has staff at a help desk in the 24 hour lab that are readily available for tech questions. The tech services also has an office that takes on the services that may take a little longer to fix."
                    },
                    new Service
                    {
                         Name = "Veterans Services",
                         Location = "UC South Room 107",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2535",
                         Email = "howellj@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/veteran.jpg,
                         ShortDescription = "Office where Veterans can get help with anything campus or non campus related",
                         LongDescription = "Office where Veterans can get help with anything campus or non campus related"
                    },
                    new Service
                    {
                         Name = "Testing & Disability Services",
                         Location = "UC South Room 207",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2243",
                         Email = "mtspring@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/iulogo.jpg,
                         ShortDescription = "Office that helps students test that have disabilities",
                         LongDescription = "Office that provides staff to help students take tests and prepare for tests."
                    },
                    new Service
                    {
                         Name = "Accounting Services",
                         Location = "UC South Room 103",
                         Hours= "M-Thu 8a-6p, F 8a-5p",
                         PhoneNumber = "812-941-2950",
                         Email = "seacctsv@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/accounting.jpg,
                         ShortDescription = "Everything that deal with the Campus's Accounting",
                         LongDescription = "Office of staff that deals with purchasing, Accounts Payable and all other financial transactions."
                    },
                    new Service
                    {
                         Name = "Admissions",
                         Location = "UC South Room 102",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2212",
                         Email = "admissions@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/admissions.jpg,
                         ShortDescription = "Office that is over admissions",
                         LongDescription = "Admissions does everything trying to get students to come to this campus and getting them ready to be sent to the registrar."
                    },
                    new Service
                    {
                         Name = "Registrar",
                         Location = "UC South Room 103",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2100",
                         Email = "sesc@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/iulogo.jpg,
                         ShortDescription = "Office that is over registrar",
                         LongDescription = "Registrar takes care of all students records and manages anything to do with those."
                    },
                    new Service
                    {
                         Name = "Language Lab",
                         Location = "Knob View Room 236",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2232",
                         Email = "tjambros@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/language.png,
                         ShortDescription = "Get help with all levels of Language study",
                         LongDescription = "The Language Lab helps and provides students of all levels material to help strengthen their knowledge of a new language. There are also staff in this office to tutor those who need the extra help."
                    },
                    new Service
                    {
                         Name = "Athletics",
                         Location = "Athletics Building",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2432",
                         Email = "athletics@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/athletics.png,
                         ShortDescription = "Office that deals with everything Athletics",
                         LongDescription = "The atheltics building encompasses the gym and weight training facility. It also provides offices for the coaching staff for the university."
                    },
                    new Service
                    {
                         Name = "Bookstore",
                         Location = "UC South",
                         Hours= "M-F 9a-5p",
                         PhoneNumber = "812-941-2250",
                         Email = "wbolen@ius.edu",
                         ImageUrl = https://crimsonstorage.blob.core.windows.net/images/bookstore.jpg,
                         ShortDescription = "Campus store with books, supplies and apparel",
                         LongDescription = "The bookstore is a shop across from the coffee shop that has all the books needed for classes in one section. Students can also purchase apparel so they can show Grenadier spirit. The bookstore also has snacks and other items needed for an everyday student."
                    },
                    new Service
                    {
                         Name = "Adult Student Center",
                         Location = "UC South Room 206",
                         Hours= "M-F 8a-5p",
                         PhoneNumber = "812-941-2650",
                         Email = "kpelle@ius.edu",
                         ImageUrl = string.Empty,
                         ShortDescription = "Office that helps the non-traditonal students",
                         LongDescription = "The Adult Student Center is an office that help non traditional students with the everyday needs of a student. This is also a place for these students to talk to mentors."
                    }
               };
          }
     }
}