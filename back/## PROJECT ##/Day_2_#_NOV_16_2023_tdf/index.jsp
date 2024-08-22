<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col">
                <nav class="navbar navbar-expand-lg" style="background-color: #e3f2fd;">
                  <div class="container-fluid">
                    <a class="navbar-brand" href="#">
                      <img src="static/images/tdf_logo.png" alt="Logo" width="30" height="24" class="d-inline-block align-text-top mx-3">
                      TDF
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                      <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="#">Link</a>
                        </li>                          
                      </ul>
                      <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                      </form>
                    </div>
                  </div>
                </nav>
            </div>
        </div>

        <div class="row">
          <div class="col-1"></div>
          <div class="col-10">
            <h3 class="my-5 py-3 bg-light text-primary ps-3 rounded-2">All Technical Topics</h3>
            <table class="table border">
              <thead class="table-light">
                <tr>
                  <th>Topics</th>
                  <th>All Posts</th>
                  <th>Open Posts</th>
                  <th>Last Post</th>
                  <th>Active Users</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>Core Java</td>
                  <td>120345</td>
                  <td>5000</td>
                  <td>16 NOV, 2023 07:12AM GMT</td>
                  <td>123</td>
                </tr>
                <tr>
                  <td>Java EE</td>
                  <td>220345</td>
                  <td>10000</td>
                  <td>16 NOV, 2023 08:21AM GMT</td>
                  <td>234</td>
                </tr>
                <tr>
                  <td>Python</td>
                  <td>520345</td>
                  <td>12000</td>
                  <td>16 NOV, 2023 08:23AM GMT</td>
                  <td>452</td>
                </tr>
                <tr>
                  <td>JavaScript</td>
                  <td>1203450</td>
                  <td>67034</td>
                  <td>16 NOV, 2023 08:34AM GMT</td>
                  <td>1256</td>
                </tr>
              </tbody>
            </table>
          </div>
          <div class="col-1"></div>
        </div>

        <div class="row position-fixed bottom-0 w-100 py-1" style="background-color: #e3f2fd;">
          <div class="col-1"></div>
          <div class="col-5 ">&copy; Technical Discussion Forum (TDF) since 300AD</div>
          <div class="col-5 text-end text-primary">
            <a href="#" class="text-decoration-none">Terms &amp; Conditions</a><span class="mx-3">|</span>
            <a href="#" class="text-decoration-none">Privacy Policy</a><span class="mx-3">|</span>
            <a href="#" class="text-decoration-none">About Us</a><span class="mx-3">|</span>
            <a href="#" class="text-decoration-none">Contact Us</a>
          </div>
          <div class="col-1"></div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>