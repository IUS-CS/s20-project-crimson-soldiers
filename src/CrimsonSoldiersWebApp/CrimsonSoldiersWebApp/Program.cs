using CrimsonSoldiersWebApp.Infrastructure.Data;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;
using System.Threading.Tasks;

namespace CrimsonSoldiersWebApp
{
     public class Program
     {
          public static async Task Main(string[] args)
          {
               var host = CreateHostBuilder(args).Build();

               using (var scope = host.Services.CreateScope())
               {
                    var services = scope.ServiceProvider;
                    var context = services.GetRequiredService<CrimsonContext>();
                    await CrimsonContextSeed.SeedAsync(context);
               }
               host.Run();
          }

          public static IHostBuilder CreateHostBuilder(string[] args) =>
              Host.CreateDefaultBuilder(args)
                  .ConfigureWebHostDefaults(webBuilder =>
                  {
                       webBuilder.UseStartup<Startup>();
                  });
     }
}