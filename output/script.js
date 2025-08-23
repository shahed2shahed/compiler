





products.forEach((product, i) => {
const button = document.createElement('button');
button.addEventListener('click', () => selectProduct(i));
button.textContent = 'tes';
container.appendChild(button);
});





