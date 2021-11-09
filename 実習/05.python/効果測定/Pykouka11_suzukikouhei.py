#本来の処理とエラー時の対処を分ける
try:
    a = int(input('整数aを入力してください:'))
    b = int(input('整数bを入力してください:')) 
#乗算　
    print('a × b は', a * b, 'です。')
#除算
    print('a ÷ b は', a / b, 'です。')
#整数ではないエラー
except ValueError:
    print('入力されたデータは整数ではありません。')
#0が入力された時のエラー
except ZeroDivisionError:
    print('0による除算は出来ません。')
#例外が捕捉されなかった場合実行
else:
    print('プログラムを正常終了します。')
#例外発生有無にかかわらず最後に実行
finally:
    print('プログラムを終了します。')
