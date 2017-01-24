from urllib2 import urlopen

url = "http://lorempixel.com"
tipos=["abstract","animals","business","cats",
       "city","food","nightlife","fashion","people",
       "nature","sports","technics","transport"]
ancho=raw_input("Cual es el ancho?")
alto=raw_input("cual es el alto?")
tipo=raw_input("cual es el tipo?")

url_request="%s/%s/%s/%s" % (url,ancho,alto,tipos[int(tipo)])
resultado=urlopen(url_request)
lectura=resultado.read()
f=open("holder.jpg","wb")
f.write(lectura)
f.close

