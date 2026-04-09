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
        <h1>${title} <span style="float:right"><a href="/pokemon/" class="btn btn-primary">Go Back</a></span></h1>
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">${pokemon.name}</h5>
                <p class="card-text">ID: ${pokemon.characterId?c}</p>
                <p class="card-text">Type: ${pokemon.type}</p>
                <p class="card-text">Description: ${pokemon.description}</p>
                <p class="card-text">Ability: ${pokemon.ability}</p>
            </div>
        </div>
        <div class="alert alert-primary" style="margin-top: 10px;">Edit Pokemon</div>
        <form action="/pokemon/update/${pokemon.characterId?c}" method="post">
            <input type="text" name="name" value="${pokemon.name}" placeholder="Name" class="form-control" /><br>
            <input type="text" name="description" value="${pokemon.description}" placeholder="Description" class="form-control" /><br>
            <input type="text" name="type" value="${pokemon.type}" placeholder="Type" class="form-control" /><br>
            <input type="text" name="ability" value="${pokemon.ability}" placeholder="Ability" class="form-control" /><br>
            <button type="submit" class="btn btn-primary">Save</button>
        </form>
        <div class="alert alert-danger" style="margin-top: 10px;">
            Delete Pokemon
            <a style="float: right;" href="/pokemon/delete/${pokemon.characterId?c}" class="btn btn-danger">Delete</a>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
