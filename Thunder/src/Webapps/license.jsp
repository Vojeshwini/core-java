<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">INFO</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">

        <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
      </div>
    </div>
  </div>
</nav>

<div align="center">
  <form action="license" method="post">
    <h1>FILL THE DETAILS!!!</h1>

    <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Name</label>
      <div class="d-flex justify-content-center">
        <input type="text" placeholder="Name" class="form-control" id="exampleInputEmail1" style="width: 500px;" name="name">
      </div>
    </div>

      <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Contact</label>
        <div class="d-flex justify-content-center">
          <input type="number" placeholder="Contact" class="form-control" id="exampleInputEmail2" style="width: 500px;" name="contact">
        </div>
      </div>

      <div class="mb-3">
        <label for="ageDropdown" class="form-label">Age</label>
        <div class="d-flex justify-content-center">
          <select class="form-select" id="ageDropdown" name="age" style="width: 500px;">
            <option selected disabled>Select age group</option>
            <option value="below18">Below 18</option>
            <option value="above18">Above 18</option>
          </select>
        </div>
      </div>



      <div class="mb-3">
        <label for="exampleInputPassword2" class="form-label">License Type</label>
        <div class="d-flex justify-content-center">
          <input type="text" placeholder="License Type" class="form-control" id="exampleInputPassword2" style="width: 500px;" name="type">
        </div>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>



</form>


</div>

</body>
</html>