from flask import Flask

app = Flask(__name__) # nuevo objeto

@app.route('/')       # wrap o un decorador
def index ():		  # Se usa una funcion
	return 'Hola mundo parte2 y otros cambios '
	
if __name__=='__main__':
	app.run(debug=True,port=8000) # Ejecuta el servidor por default en el puerto 5000
