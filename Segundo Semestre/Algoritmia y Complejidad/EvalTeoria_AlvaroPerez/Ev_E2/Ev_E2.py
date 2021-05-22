def mediaDyV(lNotas, fOut):
    if(len(lNotas) == 1):
        return lNotas[0]
    else:
        corte = len(lNotas)//2
        med1 = mediaDyV(lNotas[:corte], fOut)
        med2 = mediaDyV(lNotas[corte:], fOut)
        media = (med1 + med2)/2
        fOut.write(str(med1) + " y " + str(med2) + " -> " + str(media) + "\n")
        return media


fIn = open('ejemplodyv.txt', 'r')
fOut = open('salidadyv.txt', 'w')
listaNotas = []
for i in fIn:
    listaNotas.append(float(i))
fIn.close()
res = mediaDyV(listaNotas, fOut)
fOut.write("\n\nLa media final es " + str(res) + ".")
fOut.close()
print("Las notas son: " + str(listaNotas))
print("La media es: " + str(res))
