import {Picture} from "./Picture";

export class Post{
    id: number;
    accountId: number;
    message: string;
    likes: number;
    picture: Picture;
}
