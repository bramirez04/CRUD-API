<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${title}</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-dark" style="background-color:#e63946;">
<div class="container">
<a class="navbar-brand" href="/pokemon/">Pokemon API</a>
<a href="/pokemon/add" class="btn btn-light float-end">Add Pokemon</a>
</div>
</nav>
<div class="container" style="margin-top:15px;">
<h1>${title}</h1>
<form action="/pokemon/search" class="mb-3">
<input type="text" name="name" placeholder="Search by name" class="form-control d-inline w-auto">
<button type="submit" class="btn btn-outline-primary">Search</button>
</form>
<div class="row row-cols-3">
<#list pokemonList as pokemon>
<div class="col mb-3">
<div class="card">
<div class="card-body">
<h5 class="card-title">${pokemon.name}</h5>
<h6 class="card-subtitle text-muted">${pokemon.type}</h6>
<p class="card-text">${pokemon.description}</p>
<a href="/pokemon/${pokemon.characterId?c}" class="btn btn-sm btn-primary">View Details</a>
</div>
</div>
</div>
</#list>
</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
