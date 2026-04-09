<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>${title}</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #e63946;">
        <div class="container">
            <a class="navbar-brand" href="/pokemon/">Pokemon API</a>
            <ul class="nav justify-content-end">
                <li class="nav-item">
                    <a class="nav-link" href="/pokemon/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/pokemon/add">Add Pokemon</a>
                </li>
            </ul>
        </div>
    </nav>
    <div class="container" style="margin-top: 15px;">
        <h1>${title}</h1>
        <form action="/pokemon/add" method="post">
            <input type="text" name="name" placeholder="Name" class="form-control" /><br>
            <input type="text" name="description" placeholder="Description" class="form-control" /><br>
            <input type="text" name="type" placeholder="Type (e.g. Fire, Water)" class="form-control" /><br>
            <input type="text" name="ability" placeholder="Ability" class="form-control" /><br>
            <button type="submit" class="btn btn-primary">Save</button>
            <a href="/pokemon/" class="btn btn-outline-danger">Cancel</a>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
