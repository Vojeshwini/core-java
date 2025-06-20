<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <style>
        .shaded-navbar {
  background: linear-gradient(to bottom, #66b2ff, #000000); /* light blue to black */
}
    </style>
</head>
<body style="background-color:#7577b1ba;background-image:url(img_9.png)">
<nav class="navbar shaded-navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#" style="color:white">HACKATHON</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="index.jsp" STYLE="color:white">Home</a>
            </div>
        </div>
    </div>
</nav>
<div align="center">
    <h1 style="color:Green">${success}</h1>
    <h1 style="color:red">${Notsuccess}</h1>

</div>


<div align="center">
    <h1 style="color:white">FILL THE INFORMATION!!!</h1>
    <BR>
    <form action="submit" method="post">
        <div>
            <label for="collegeName" style="color:white">College Name:</label>
            <div  class="d-flex justify-content-center">
                <select id="collegeName" name="collegeName" style="width: 500px;" class="form-control" placeholder="Select your college" id="exampleInputEmail1" required value="${dto.collegeName}">
                    <option value="" disabled selected>Select your College</option>
                    <option value="KVG College of Engineering">KVG College of Engineering</option>
                    <option value="Sahayadris College of Engineering">Sahayadris College of Engineering </option>
                    <option value="Coorg Institute of Technology">Coorg Institute of Technology </option>
                    <option value="NITTE">NITTE  </option>
                    <option value="Vivekananda College of Engineering">Vivekananda College of Engineering  </option>
                    <option value="Karavali Collge of Engineering">Karavali Collge of Engineering</option>
                    <option value="RV College of Engineering">RV College of Engineering</option>
                    <option value="Sri Devi Institute of Technology">Sri Devi Institute of Technology</option>
                    <option value="MIT">MIT</option>
                    <option value="JSS college of Engineering">JSS college of Engineering</option>
                    <option value="Banglore Institute of Technology">Banglore Institute of Technology</option>
                    <option value="Ramaiah Institute of Technology">Ramaiah Institute of Technology</option>
                    <option value="Dayananda Sagar College of Engineering">Dayananda Sagar College of Engineering</option>
                </select>
            </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label" style="color:white">Team Name</label>
                        <div class="d-flex justify-content-center">
                            <input type="text" placeholder="Enter your team name" class="form-control" id="exampleInputEmail2" style="width: 500px;" name="teamName"  required value="${dto.teamName}">
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="exampleInputEmail3" class="form-label"  style="color:white">Total members in your team</label>
                        <div class="d-flex justify-content-center">
                            <input type="number" placeholder="Enter total members in your team " class="form-control" id="exampleInputEmail3" style="width: 500px;" name="totalMembers" required value="${dto.totalMembers}">
                        </div>
                    </div>


                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label" style="color:white">Team Leader Name</label>
                        <div class="d-flex justify-content-center">
                            <input type="text" placeholder="Enter team leader name" class="form-control" id="exampleInputEmail4" style="width: 500px;" name="teamLeader" required value="${dto.teamLeader}">
                        </div>
                    </div>


            <div class="mb-3">
                <label for="exampleInputEmail3" class="form-label" style="color:white">Phone Number</label>
                <div class="d-flex justify-content-center">
                    <input type="number" placeholder="Enter you contact number" class="form-control" id="exampleInputEmail5" style="width: 500px;" name="contact" required value="${dto.contact}">
                </div>
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail3" class="form-label" style="color:white" style="color:white">Email</label>
                <div class="d-flex justify-content-center">
                    <input type="email" placeholder="Enter team leader email" class="form-control" id="exampleInputEmail6" style="width: 500px;" name="email" required value="${dto.email}">
                </div>
            </div>




        <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>

</div>


</body>
</html>