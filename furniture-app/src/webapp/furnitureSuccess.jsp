<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>License</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</head>
<body style="background-image:url(./license.jp">
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
<h1>${message}</h1>
<table class="table">
    <thead>
    <tr>

        <th scope="col">Product Number</th>
        <th scope="col">Brand</th>
        <th scope="col">Material</th>
        <th scope="col">Size</th>

    </tr>
    </thead>
    <tbody>
    <tr>

        <td>${furnituredto.productNumber}</td>
        <td>${furnituredto.brand}</td>
        <td>${furnituredto.material}</td>
        <td>${furnituredto.size}</td>

    </tr>

    </tbody>
</table>



</body>
</html>