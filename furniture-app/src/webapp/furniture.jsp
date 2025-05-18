<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Furniture</title>
    <style>
        body{
        background-color:"blue";
        }
    </style>

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
    <form action="furniture" method="post">
        <h1>FILL THE DETAILS!!!</h1>

        <div class="mb-3">
            <label for="exampleInputPassword2" class="form-label">Product Number</label>
            <div class="d-flex justify-content-center">
                <input type="text" placeholder="Product Number" class="form-control" id="exampleInputPassword2" style="width: 500px;" name="productNumber">
            </div>
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Brand</label>
            <div class="d-flex justify-content-center">
                <input type="text" placeholder="Brand" class="form-control" id="exampleInputEmail1" style="width: 500px;" name="brand">
            </div>
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Material</label>
            <div class="d-flex justify-content-center">
                <input type="text" placeholder="Material" class="form-control" id="exampleInputEmail2" style="width: 500px;" name="material">
            </div>
        </div>

        <div class="mb-3">
            <label for="size" class="form-label">Size</label>
            <div class="d-flex justify-content-center">
                <select class="form-select" id="size" name="size" style="width: 500px;">
                    <option selected disabled>Select Size</option>
                    <option value="Small">Small</option>
                    <option value="Medium">Medium</option>
                </select>
            </div>
        </div>



        <button type="submit" class="btn btn-primary">Submit</button>
        </form>
            </div>


</body>
</html>