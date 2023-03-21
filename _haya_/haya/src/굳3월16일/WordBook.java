package 굳3월16일;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordBook {
	private ArrayList<Word> wordlist = new ArrayList<Word>();

	public void addWord(String word, String mean) {
		Word newWord = new Word(word, mean);
		wordlist.add(newWord);
		System.out.println("단어가 추가됨");
	}

	public void printWord() {
		if (wordlist.size() == 0) {
			System.out.println("단어가 없습니다.");
		} else {
			Collections.sort(wordlist, new Comparator<Word>() {

				@Override
				public int compare(Word o1, Word o2) {
					// TODO Auto-generated method stub
					return o1.getWord().compareTo(o2.getWord());
				}
			});
			System.out.println("저장된 단어 목록");
			for (Word w : wordlist) {
				System.out.println(w.getWord() + " : " + w.getMean());
			}
		}
	}

	public void searchWord(String word) {
		boolean exit = false;
		for (Word w : wordlist) {
			if (w.getWord().equals(word)) {
				System.out.println(w.getWord() + " : " + " 의뜻 :" + w.getMean());
				exit = true;
				break;
			}
		}
		if (!exit) {
			System.out.println("해당 단어가 없음");
		}
	}

	public void fixWord(String word, String newWord) {
		boolean exit = false;
		for (Word w : wordlist) {
			if (w.getWord().equals(word)) {
				w.setWord(newWord);
				System.out.println(w.getWord() + " : 의 단어가 수정됨");
				exit = true;
				break;
			}
		}
		if (!exit) {
			System.out.println("해당 단어가 없음");
		}
	}

	public void deleteWord(String word) {
		boolean exit = false;
		for (Word w : wordlist) {
			if (w.getWord().equals(word)) {
				wordlist.remove(w);
				System.out.println(w.getWord() + " : 해당 단어 삭제됨");
				exit = true;
				break;
			}
		}
		if (!exit) {
			System.out.println("해당 단어가 없음");
		}
	}

}
