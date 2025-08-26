products = 
[{id : 1 , name : 'Product 1' , price : '40' , image : 'images/butterfly.jpg' , description : 'no thing' , details : 'Butterfly' , date : '2025-08-01T10:20:00'  }
,{id : 2 , name : 'Product 2' , price : '55' , image : '' , description : 'another product' , details : 'Sample' , date : ''  }
];

function addProduct() {
window.location.href = 'add-product.html';
}

function viewDetails(id) {
window.location.href = 'details.html?id=' + id;
}

function editProduct(id) {
window.location.href = 'edit-product.html?id=' + id;
}








    const button = document.getElementById('addBtn0');
    const div0 = document.getElementById('Identifier0');

function renderProducts() {
div0.innerHTML = '';

products.forEach((p) => {
const ele0 = document.createElement('div');
ele0.className = "product-card";
ele0.innerHTML = `
<div class = "img-box" ><img src="${p.image || 'assets/no-image.png'}" alt="${p.name}"></div>

<div class = "card-body" >
<h3 >${p.name}</h3>
<p class = "desc" >${p.description}</p></div>

<div class = "card-actions" >
<button class = "details-btn"  onclick="viewDetails(${p.id})">Details</button>
<button class = "details-btn"  onclick="editProduct(${p.id})">Edit</button></div>
`;
div0.appendChild(ele0);
});
}
button.addEventListener('click', addProduct);
renderProducts();
   


