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
    <form action="fir" method="post">
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
            <label for="exampleInputPassword3" class="form-label">Location</label>
            <div class="d-flex justify-content-center">
                <input type="text" name="location" placeholder="Location" class="form-control" id="exampleInputPassword3" style="width: 500px;" name="type">
            </div>
        </div>



        <div class="mb-3">
            <label for="exampleInputPassword4" class="form-label">Details</label>
            <div class="d-flex justify-content-center">
                <input type="text" name="details" placeholder="Details" class="form-control" id="exampleInputPassword4" style="width: 500px;" name="type">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>



    </form>
</div>
</body>
</html>