using CrimsonSoldiersWebApp.ApplicationCore.Entities;
using CrimsonSoldiersWebApp.Infrastructure.Data;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;

namespace CrimsonSoldiersWebApp.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ServiceController : ControllerBase
    {
          readonly CrimsonContext _dbContext;

          public ServiceController(CrimsonContext dbContext)
          {
               _dbContext = dbContext;
          }

          [HttpGet]
          public ActionResult<List<Service>> GetAll()
          {
               var result = _dbContext.Services.ToList();
               return result;
          }
    }
}