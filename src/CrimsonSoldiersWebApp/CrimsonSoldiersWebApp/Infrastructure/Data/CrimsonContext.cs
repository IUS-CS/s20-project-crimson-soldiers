using CrimsonSoldiersWebApp.ApplicationCore.Entities;
using Microsoft.EntityFrameworkCore;

namespace CrimsonSoldiersWebApp.Infrastructure.Data
{
     public class CrimsonContext : DbContext
     {
          public CrimsonContext(DbContextOptions<CrimsonContext> options)
            : base(options)
          {
          }

          public DbSet<Service> Services { get; set; }
     }
}