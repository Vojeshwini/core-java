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
        .class1{
        margin-left:50px;
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
                <a class="nav-link active" aria-current="page" href="Hackathon.jsp" STYLE="color:white">Form</a>

            </div>
        </div>
    </div>
</nav>
<br>
<br>
<form action="search" method="get">
    <div align="center">
        <div class="mb-3">
            <label for="exampleInputEmail11" class="form-label" style="color:white">Search by ID </label>
            <div class="d-flex justify-content-center">
                <input type="text" placeholder="Enter ID" class="form-control" id="exampleInputEmail11" style="width: 500px;" name="id">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Search</button>
    </div>


</form>
<br>
<br>
<div class="class1">
<br>
<!--<h1 style="color:White" align="center">${message}</h1>-->
    <h1 style="color:White" align="center">Details of Hackathon Participants
    </h1>

    <br>
<!--    ===================================================================================-->
<!--<h4 style="color:white"><Strong>${column1}&nbsp;&nbsp;</Strong>${hackathonDto.collegeName}</h4>-->
<!--<br>-->
<!--<h4 style="color:white"><Strong>${column2}&nbsp;&nbsp;</Strong>${hackathonDto.teamName}</h4>-->
<!--<br>-->
<!--<h4 style="color:white"><Strong>${column3}&nbsp;&nbsp;</Strong>${hackathonDto.ntotalMembers}</h4><br>-->
<!--<h4 style="color:white"><Strong>${column4}&nbsp;&nbsp;</Strong>${hackathonDto.teamLeader}</h4><br>-->
<!--<h4 style="color:white"><Strong>${column5}&nbsp;&nbsp;</Strong>${hackathonDto.ncontact}</h4><br>-->
<!--<h4 style="color:white"><Strong>${column6}&nbsp;&nbsp;</Strong>${hackathonDto.email}</h4><br>-->
    <!--    ===================================================================================-->

    <table class="table" style="width: 700px;" align="center">
        <thead>
        <tr>

            <th scope="col">College name</th>
            <th scope="col">Team name</th>
            <th scope="col">Total members in team</th>
            <th scope="col">Team Leader Name</th>
            <th scope="col">Phone Number</th>
            <th scope="col">Email</th>

        </tr>
        </thead>
        <tbody>
        <tr>

            <td>${hackathonDto.collegeName}</td>
            <td>${hackathonDto.ntotalMembers}</td>
            <td>${hackathonDto.ntotalMembers}</td>
            <td>${hackathonDto.teamLeader}</td>
            <td>${hackathonDto.ncontact}</td>
            <td>${hackathonDto.email}</td>

        </tr>

        </tbody>
    </table>


</div>
</body>
</html>